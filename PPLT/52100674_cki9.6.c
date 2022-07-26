#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>
/** Type definitions */
typedef struct{
  int employeeID;
  char firstName[50];
  char lastName[50];
  char gender[10];
  char dob[15];
  int department;
  char country[50];
} Employee;
typedef struct{
  int projectId;
  char projectName[100];
  int projectWeek;  
} Project;
typedef struct{
  int employeeId;
  int projectId;
  float progress;
} Progress;
typedef enum {false, true} bool;
/** Constants definitions */
const char* EMPLOYEE_FILE_PATH = "./Employee.csv";
const char* PROGRESS_FILE_PATH = "./Progress.csv";
const char* PROJECT_FILE_PATH = "./Project.csv";
const char* ERROR_FILE_PATH = "./check.txt";
const char* RESULT_FILE_PATH = "./result.csv";
const char* WRONG_SYNTAX = "wrong syntax";
const int MAX_LENGTH = 300;
const bool DEBUG = false;
/** Methods definitions */
int stricmp(const char *strA, const char *strB) {
  int ca, cb;
  do {
     ca = (unsigned char) *strA++;
     cb = (unsigned char) *strB++;
     ca = tolower(toupper(ca));
     cb = tolower(toupper(cb));
   } while (ca == cb && ca != '\0');
   return ca - cb;
}
char* trimString(char *str){
    char *end;
    while(isspace((unsigned char)*str)) str++;
    if(*str == 0)
        return str;
    end = str + strlen(str) - 1;
    while(end > str && isspace((unsigned char)*end)) end--;
    end[1] = '\0';
    return str;
}
int compareEmployeeAsc(const void * a, const void * b){
  Employee* employeeA = (Employee*) a;
  Employee* employeeB = (Employee*) b;
  int lastNameCmp = strcmp(employeeA->lastName, employeeB->lastName);
  if (lastNameCmp == 0){
      return strcmp(employeeA->firstName, employeeB->firstName);
  }
  return lastNameCmp;
}
int compareEmployeeDesc(const void * a, const void * b){
  Employee* employeeA = (Employee*) a;
  Employee* employeeB = (Employee*) b;
  int lastNameCmp = strcmp(employeeB->lastName, employeeA->lastName);
  if (lastNameCmp == 0){
      return strcmp(employeeA->firstName, employeeB->firstName);
  }
  return lastNameCmp;
}
int numberOfRecords(const char* fileName){
    const int MAXCHAR = 2000;
    char inpArr[MAXCHAR];
    FILE *fp = fopen(fileName,"r");
    int size = 0;
    while (!feof(fp)){
        fgets(inpArr, MAXCHAR, fp);
        if (!feof(fp) && strlen(inpArr) > 0) size++;
    }    
    return size - 1;
}
char** readCsvFile(const char* fileName, int size){
    char **inpArr;
    FILE *fp = fopen(fileName,"r");
    char ingored[100];
    fgets(ingored, MAX_LENGTH, fp); // Read the header line
    inpArr = malloc(size * sizeof(char*));
    int i;
    for ( i = 0; i < size; i++){
        inpArr[i] = malloc(MAX_LENGTH * sizeof(char));
        fgets(inpArr[i], MAX_LENGTH, fp);
    }  
    return inpArr;
}
void printEmployee(Employee* employee, FILE* fp){
  fprintf(fp, "%d,%s,%s,%s,%s,%d,%s\n", employee->employeeID, employee->firstName, employee->lastName, employee->gender, employee->dob, employee->department, employee->country);
}
void printProject(Project* project, FILE* fp){
  fprintf(fp, "%d,%s,%d\n", project->projectId, project->projectName, project->projectWeek);
}
void printProgress(Progress* progress, FILE* fp){
  fprintf(fp, "%d\n", progress->employeeId);
}
void readEmployeesCsv(Employee* employees, int size){
  char **inputArray = readCsvFile(EMPLOYEE_FILE_PATH, size);
  int i;
  for ( i = 0 ; i < size; i++){    
    char* parts = strtok(inputArray[i],",");
    (employees+i)->employeeID = atoi(parts);
    parts = strtok(NULL, ",");
    strcpy((employees+i)->firstName, parts);
    parts = strtok(NULL, ",");
    strcpy((employees+i)->lastName, parts);
    parts = strtok(NULL, ",");
    strcpy((employees+i)->gender, parts);
    parts = strtok(NULL, ",");
    strcpy((employees+i)->dob, parts);
    parts = strtok(NULL, ",");
    (employees+i)->department = atoi(parts);
    parts = strtok(NULL, ",");
    strcpy((employees+i)->country, trimString(parts));
  }
}
void readProjectsCsv(Project* projects, int size){
  char **inputArray = readCsvFile(PROJECT_FILE_PATH, size);
  int i;
  for ( i = 0 ; i < size; i++){  
    char* parts = strtok(inputArray[i],",");
    (projects+i)->projectId = atoi(parts);
    parts = strtok(NULL, ",");
    strcpy((projects+i)->projectName, parts);
    parts = strtok(NULL, ",");
    (projects+i)->projectWeek = atoi(parts);
  }
}
void readProgressesCsv(Progress* progresses, int size){
  char **inputArray = readCsvFile(PROGRESS_FILE_PATH, size);
  int i;
  for ( i = 0 ; i < size; i++){  
    char* parts = strtok(inputArray[i],",");
    (progresses+i)->employeeId = atoi(parts);
    parts = strtok(NULL, ",");
    (progresses+i)->projectId = atoi(parts);
    parts = strtok(NULL, ",");
    (progresses+i)->progress = atof(parts);
  }
}
int numberOfSpace(char* inputStr){
  int counter = 0, length = strlen(inputStr);
  int i;
  for( i = 0; i < length; i++){
    if (inputStr[i] == ' ') counter++;
  }
  return counter;
}
int numberOfWords(char* inputStr){
  char* tmp = malloc(strlen(inputStr) * sizeof(char));
  strcpy(tmp, inputStr);
  int counter = 0;
  char* parts = strtok(tmp," ");
  while (parts != NULL){
    counter++;
    parts = strtok(NULL, " ");
  }
  return counter;
}
bool isCommandValid(char* cmd){
  int i;
  for(i = 0; i < strlen(cmd); i++){
    if (!(
      (cmd[i] >= 'a' && cmd[i] <= 'z') ||
      (cmd[i] >= 'A' && cmd[i] <= 'Z') ||
      (cmd[i] >= '0' && cmd[i] <= '9') ||
      (cmd[i] == '.') || (cmd[i] == '-')
    )) return false;
  }
  return true;
}
bool isNumber(char* inp) {
    char* p;
    strtod(inp, &p);
    return *p == 0;
}
void writeSyntaxErrorFile(){
  FILE *fp = fopen(ERROR_FILE_PATH,"w+");
  fputs(WRONG_SYNTAX, fp);
  fclose(fp);
}
void writeResultCsvFile(char* toWrite){
  FILE *fp = fopen(RESULT_FILE_PATH,"w+");
  fputs(toWrite, fp);
  fclose(fp);
}
void getParams(char* command, char* cmd, char* param){
  char* parts = strtok(command," ");  
  strcpy(cmd, parts);
  parts = strtok(NULL, " ");
  strcpy(param, parts);
}
void processUserCommand(char* command, char* cmd, char* param){
  if (DEBUG){
    printf("Command length = %lu\n", strlen(command));
    printf("Space counter = %d\n", numberOfSpace(command));
    printf("Number of words = %d\n", numberOfWords(command));
    printf("Command: "); puts(command);
  }
  if (numberOfSpace(command) != 1 || numberOfWords(command) != 2){
    writeSyntaxErrorFile();
    return;
  }
  getParams(command, cmd, param);
  if (DEBUG){
    printf("CMD: %s\n", cmd);
    printf("PARAM: %s\n", param);
  }
  if (!isCommandValid(cmd) || !isCommandValid(param)){
    writeSyntaxErrorFile();
    return;
  }
}
void countDepartmentEmployees(char* department, Employee* employees, int size){
  int intDepartment = atoi(department);
  if (intDepartment < 0) {
    writeSyntaxErrorFile();
    return;
  }
  int counter = 0;
  int i;
  for( i = 0; i < size; i++){
    if ((employees+i)->department == intDepartment) counter++;
  }
  if (DEBUG)
    printf("Count of department %d: %d", intDepartment, counter);
  FILE *fp = fopen(RESULT_FILE_PATH,"w+");
  fprintf(fp, "%d", counter);
  fclose(fp);
}
void printEmployeesByGender(char* gender, Employee* employees, int size){
  if (stricmp(gender, "male") == 0 || (stricmp(gender, "female") == 0)){
    FILE *fp = fopen(RESULT_FILE_PATH,"w+");
    int i;
    for(i = 0; i < size; i++){
      if (stricmp((employees+i)->gender, gender) == 0){
        printEmployee((employees+i), fp);
      }
    }
    fclose(fp);
  } else {
    writeSyntaxErrorFile();
  }
}
void printAverageProgress(char* projectId, Progress* progresses, int size){
  if (!isNumber(projectId)){
    writeSyntaxErrorFile();
    return;
  }
  int pId = atoi(projectId);
  if (pId < 0) {
    writeSyntaxErrorFile();
    return;
  }
  float totalProgress = 0;
  int projectCounter = 0;
  int i;
  FILE *fp = fopen(RESULT_FILE_PATH,"w+");
  for(i = 0; i < size; i++){
    if ((progresses+i)->projectId == pId){
      projectCounter++;
      totalProgress += (progresses+i)->progress;      
    }
  }
  if (DEBUG){
    printf("Total progress = %.3f, Number of projects = %d, Average = %f", totalProgress, projectCounter, totalProgress/projectCounter);
  }
  if (projectCounter > 0){
    fprintf(fp, "%.3f", totalProgress/projectCounter);  
  } else {
    fprintf(fp, "0.00");
  }
   fclose(fp);
}
bool isProgressPrinted(char* progressStr, char* stored){
  if (DEBUG) {
    printf("Stored: %s\n", stored);
    printf("Need to scan: %s\n", progressStr);
  }
  char* existed = strstr(stored, progressStr);
  bool result = existed != NULL;
  if (DEBUG) {
    if (result) {
      printf("%s already printed\n", progressStr);
    }
  }
  return existed != NULL;
}
void printReportByProgress(char* progress, Progress* progresses, int size){
  if (!isNumber(progress)){
    writeSyntaxErrorFile();
    return;
  }
  float fProgress = atof(progress);
  if (fProgress > 1 || fProgress < 0){
    writeSyntaxErrorFile();
    return;
  }
  FILE *fp = fopen(RESULT_FILE_PATH,"w+");
  char printed[100000] = "";
  int i;
  for( i = 0; i < size; i++){
    if ((progresses+i)->progress == fProgress){
      char progressStr[30];
      sprintf(progressStr, "%d|", (progresses+i)->employeeId);
      if (!isProgressPrinted(progressStr, printed)){
        strcat(printed,progressStr);
        printProgress(progresses+i, fp);
      }
    }
  }
  fclose(fp);
}
void printEmployeesByCountry(char* country, Employee* employees, int size){  
    FILE *fp = fopen(RESULT_FILE_PATH,"w+");
    int i;
    for( i = 0; i < size; i++){
      if (stricmp((employees+i)->country, country) == 0){
        printEmployee((employees+i), fp);
      }
    }
    fclose(fp);
}
void sortEmployeesBy(char* sortBy, Employee* employees, int size){
  if (stricmp(sortBy, "asc") == 0 || (stricmp(sortBy, "desc") == 0)){
    FILE *fp = fopen(RESULT_FILE_PATH,"w+");
    int i;
    if (stricmp(sortBy, "asc") == 0){
      qsort(employees, size, sizeof(Employee), compareEmployeeAsc);
      for( i = 0; i < size; i++){
        printEmployee(employees+i, fp);
      }
    }
    if (stricmp(sortBy, "desc") == 0){
      qsort(employees, size, sizeof(Employee), compareEmployeeDesc);
      for( i = 0; i < size; i++){     
        printEmployee(employees+i, fp);
      }
    }
    fclose(fp);
  } else {
    writeSyntaxErrorFile();
  }
}
int main(void) {
  /* Input from CSV files*/
  int numberOfEmployees = numberOfRecords(EMPLOYEE_FILE_PATH);
  int numberOfProject = numberOfRecords(PROJECT_FILE_PATH);
  int numberOfProgress = numberOfRecords(PROGRESS_FILE_PATH);
  Employee* employees = (Employee*) malloc(numberOfEmployees * sizeof(Employee));
  Project* projects = (Project*) malloc(numberOfProject * sizeof(Project));
  Progress* progresses = (Progress*) malloc(numberOfProgress * sizeof(Progress));
  readEmployeesCsv(employees, numberOfEmployees);
  readProjectsCsv(projects, numberOfProject);
  readProgressesCsv(progresses, numberOfProgress);
  /* Input from stdin */
  char userCommand[MAX_LENGTH], cmd[MAX_LENGTH], param[MAX_LENGTH];  
  scanf("%20[^\n]", userCommand);
  processUserCommand(userCommand, cmd, param);
  if (stricmp(cmd, "count") == 0){
    countDepartmentEmployees(param, employees, numberOfEmployees);
  } else if (stricmp(cmd, "list") == 0){
    printEmployeesByGender(param, employees, numberOfEmployees);
  } else if (stricmp(cmd, "report") == 0){
    printReportByProgress(param, progresses, numberOfProgress);
  } else if (stricmp(cmd, "average") == 0){
    printAverageProgress(param, progresses, numberOfProgress);
  } else if (stricmp(cmd, "sort") == 0){
    sortEmployeesBy(param, employees, numberOfEmployees);
  } else if (stricmp(cmd, "country") == 0){
    printEmployeesByCountry(param, employees, numberOfEmployees);
  } else {
    writeSyntaxErrorFile();
  }
  return 0;
}
