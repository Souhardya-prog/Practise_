//Write java program to convert a number in roman to nums
import java.util.Scanner;
public class RomanToIntegers
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in Roman");
        String a = sc.nextLine();
        int length = a.length();//for the length of the string
        char arr[] = new char[length];//Declaring a char[]

        //putting the symbols in a char type array
        for(int i = 0; i< length; i++){
            arr[i] = a.charAt(i);
        }
        int num = 0;
        char ch=' ';


        for(int i = 0; i<arr.length; i++){
            ch = arr[i];// putting each roman char in ch one by one.
            switch(ch){
                case 'M': num+=1000;
                    break;
                case 'D': num+=500;
                    break;

                case 'C':if((i+1)==arr.length){
                    num+=100;
                    break;
                }
                    if(arr[i+1] == 'D'){
                        num+=(500-100);
                        i++;
                        break;
                    }
                    if(arr[i+1] == 'M'){
                        num+=(1000-100);
                        i++;
                        break;
                    }
                    num+=100;
                    break;

                case 'L': num+=50;
                    break;

                case 'X':if((i+1)==arr.length){
                    num+=10;
                    break;
                }
                    if(arr[i+1] == 'L'){
                        num+=(50-10);
                        i++;
                        break;
                    }
                    if(arr[i+1] == 'C'){
                        num+=(100-10);
                        i++;
                        break;
                    }
                    num+=10;
                    break;

                case 'V': num+=5;
                    break;

                case 'I':if((i+1)==arr.length){
                    num+=1;
                    break;
                }
                    if(arr[i+1] == 'V'){
                        num+=(5-1);
                        i++;
                        break;
                    }
                    if(arr[i+1] == 'X'){
                        num+=(10-1);
                        i++;
                        break;
                    }
                    num+=1;
                 default: System.out.println("Inavalid, Enter Roman numerals");
                     System.exit(0);
            }
        }
        System.out.println("Integer form: "+num);
    }
}
