import java.lang.String;

class Exercise03{
    public static int countWord(String paragraph){
        return paragraph.length();
    }

    public static int countSentences(String paragraph){
        String[] parts = paragraph.split("\\.");
        return parts.length;
    }

    public static int countAppear(String paragraph, String word){
        String[] temp = paragraph.split(word);
        return paragraph.split(word).length-1;
    }

    public static void main(String[] args){
        String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.";
        String word = "al";
        System.out.println("countWord: " + countWord(paragraph));
        System.out.println("countSentences: " + countSentences(paragraph));
        System.out.println("countAppear: " + countAppear(paragraph, word));
    }

}