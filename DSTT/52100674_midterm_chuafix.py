import scipy.io
import numpy as np

def get_selling_list(transactions):
    selling_transaction = np.array(list(map(lambda x: x[-1], transactions)),dtype='object')
    return np.hstack(selling_transaction)


def get_product_price(products):
    product_prices = dict(
        list((map(lambda x: (str(x[0]).strip(), float(x[1])), products))))
    return product_prices


def get_products_and_counts(transactions):
    all_products = get_selling_list(transactions)
    set_products, counts = np.unique(all_products, return_counts=True)
    return set_products, counts


def get_product_quantity_user(transactions, history, k):
    user_history = list(map(lambda x: x[-1], filter(
        lambda x: str(x[0][0]).strip() == str(k).strip(), history)))
    sale = np.array([], dtype='object')
    for transaction in user_history[0]:
        sale_products = list(map(lambda x: x[1],
                                 filter(lambda x: str(x[0][0]).strip() == str(transaction).strip(), transactions)))
        sale = np.append(sale, sale_products)
    set_products, counts = np.unique(sale, return_counts=True)
    return set_products, counts


def get_product_category(products):
    categories = set(products[:, 3])

    product_category = {}
    for category in categories:
        product_list = list(filter(lambda x: x[3] == category, products))
        product_category[str(category).strip()] = list(map(lambda x: str(x[0]).strip(), product_list))
    return product_category


def req1(transactions):
    try:
        set_products, counts = get_products_and_counts(transactions)
        data_products = dict(zip(set_products, counts))
        data_min = sorted([x for x in data_products if data_products[x] == min(counts)])
        data_max = sorted([x for x in data_products if data_products[x] == max(counts)])
    except:
        return [], []
    return data_max, data_min


def req2(products):
    try:
        products_quantity = list(map(lambda x: int(x), products[:, 2]))
        min_value = min(products_quantity)
        max_value = max(products_quantity)

        min_stock = sorted([str(x[0]).strip() for x in products if int(x[2]) == min_value])
        max_stock = sorted([str(x[0]).strip() for x in products if int(x[2]) == max_value])
    except:
        return [], []
    return max_stock, min_stock


def req3(transactions, products):
    try:
        all_products = get_selling_list(transactions)
        product_prices = get_product_price(products)

        all_price = np.array(list(map(lambda x: product_prices[x], all_products)))
        price = np.round(np.sum(all_price), 1)

        if int(price) == price:
            price = int(price)
    except:
        return 0.0
    return price


def req4(transactions, products):
    try:
        set_products, counts = get_products_and_counts(transactions)
        products_price = get_product_price(products)
        data_products = dict(zip(set_products, counts))
        sale_data = {}
        for product, sale in data_products.items():
            sale_data[product] = sale * products_price[product]

        sale_highest = max((sale_data.values()))
        product_sale_highest = list(filter(lambda x: x[1] == sale_highest, sale_data.items()))
    except:
        return []
    return sorted(list(map(lambda y: y[0], product_sale_highest)))


def req5(history, k):
    result = []
    try:
        user_number_transactions = {}
        for his in history:
            user_number_transactions[his[0][0]] = len(his[1])
        while len(result) < k:
            sale_highest = max((user_number_transactions.values()))
            users_sale_highest = list(filter(lambda x: x[1] == sale_highest, user_number_transactions.items()))
            users = (list(map(lambda x: x[0], users_sale_highest)))
            result.extend(users)
            for user in users:
                del user_number_transactions[user]
    except:
        return result
    return result[:k]


def req6(transactions, history, k):
    try:
        set_products, counts = get_product_quantity_user(transactions, history, k)
        sale_data = dict(zip(set_products, counts))
        highest_buy = max(sale_data.values())
        products_highest_by = list(filter(lambda x: x[1] == highest_buy, sale_data.items()))
        products_ = list(map(lambda x: x[0], products_highest_by))
    except:
        return []
    return np.array(products_)


def req7(transactions, history):
    try:
        list_transaction = history[:, 1]
        min_number_transaction = min(list(map(lambda x: len(x), list_transaction)))
        smallest_transactions = list(map(lambda y: y, filter(lambda x: len(x) == min_number_transaction, list_transaction)))
        product_sale = []
        for transaction in transactions:
            tran_name = str(transaction[0][0]).strip()
            if tran_name in smallest_transactions:
                product_sale.append(transaction[1])
        history_transactions = np.hstack(product_sale)
        set_products, counts = np.unique(history_transactions, return_counts=True)
        sale_data = dict(zip(set_products, counts))
        highest_sale = max(sale_data.values())
        data_highest_sale = list(filter(lambda x: x[1] == highest_sale, sale_data.items()))
        product_highest_sale = list(map(lambda x: x[0], data_highest_sale))
    except: 
        return []
    return product_highest_sale


def req8(transactions, history, k):
    try:
        set_products_k, counts_k = get_product_quantity_user(transactions, history, k)
        data_sale_k = dict(zip(set_products_k, counts_k))
        data_other_user = []
        data_mapping = []

        for his in history:
            user = his[0][0]
            if user != k:
                set_products, counts = get_product_quantity_user(transactions, history, user)
                data_sale_u = dict(zip(set_products, counts))
                data_other_user.append((user, data_sale_u))

        for user, data in data_other_user:
            temp = []
            if len(data.keys()) > len(data_sale_k.keys()):
                source = data
                dest = data_sale_k
            else:
                source = data_sale_k
                dest = data
                
            for product in source.keys():
                if product in dest.keys():
                    temp.append(dest[product])
                else:
                    temp.append(0)
            vector = [x for x in source.values()]
            data_mapping.append((user, vector, temp))

        cosine_similarity = {}
        for user, vector, compare_with in data_mapping:
            cos_sim = np.dot(vector, compare_with) / (np.linalg.norm(vector) * np.linalg.norm(compare_with))
            cosine_similarity[user] = cos_sim

        max_value = max(cosine_similarity.values())

        similarity = list(filter(lambda x: x[1] == max_value, cosine_similarity.items()))

        user_similarity = list(map(lambda x: x[0], similarity))
    except:
        return []
    return user_similarity


def req9(transactions, history, products):
    try:
        history_transactions = np.hstack(
            np.array(list(map(lambda x: x[1], history)),dtype='object'))
        selling_history = np.array([], dtype='object')
        for transaction in history_transactions:
            products_sale = list(
                filter(lambda x: str(x[0][0]).strip() == str(transaction).strip(), transactions))
            products_sale = list(map(lambda x: x[1], products_sale))
            selling_history = np.append(selling_history, products_sale)
        sold_products = np.unique(selling_history, return_counts=False)
        sold_products = list(map(lambda x: str(x).strip(), sold_products))
        never_sold_product = np.array([], dtype='object')

        for product in products:
            if str(product[0]).strip() not in sold_products:
                never_sold_product = np.append(never_sold_product, str(product[0]).strip())
    except:
        return []
    return never_sold_product.tolist()


def req10(history, transactions, products, k):
    try:
        set_products, counts = get_product_quantity_user(transactions, history, k)
        sale_data = dict(zip(set_products, counts))
        product_category = get_product_category(products)
        product_category_sort = dict(sorted(product_category.items(), key=lambda x: x[0]))
        category_buy = []
        for category, product_list in product_category_sort.items():
            item_buy = list(filter(lambda x: x in product_list, sale_data.keys()))
            number_buy = 0
            for product, quantity in sale_data.items():
                if product in item_buy:
                    number_buy += quantity
            category_buy.append((category, number_buy))
        max_buy = max(list(map(lambda x: x[1], category_buy)))
    except:
        return None
    return next((x[0] for x in category_buy if x[1] == max_buy), 0)      
 





