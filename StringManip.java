import  java.util.Scanner;
public class StringManip {
    public static void main(String[] args) {
        String s1, s2,s3,s4;
        int ch,i,len,f=0;
        Scanner reader = new Scanner(System.in);
        System.out.print("\nSTRING OPERATIONS");
        System.out.print("\n=================");
        System.out.print("\n1.Length\n2.Concat\n3.Compare\n4.Copy\nEnter your choice: ");
        ch=reader.nextInt();
        switch (ch){
            case 1:System.out.print("Enter the string: ");
                   s1 = reader.next();
                   len=s1.length();
                   System.out.print("Length of string: "+len);
                   break;
            case 2:System.out.print("Enter the First String: ");
                   s1 = reader.next();
                   System.out.print("Enter the Second String: ");
                   s2 = reader.next();
                   s3=s1.concat(s2);
                   s4=s1+s2;
                   System.out.print("Concatenated String: "+s4);
                   System.out.print("\nConcatination using library function: "+s3);
                   break;
            case 3:System.out.print("Enter first string: ");
                   s1 = reader.next();
                   System.out.print("Enter second string: ");
                   s2 = reader.next();
                   
                System.out.print("\nCompare using library function: "+s1.equals(s2));
                break;
            case 4:System.out.print("Enter first string: ");
                   s1 = reader.next();
                    System.out.print("Enter second string: ");
                    s2 = reader.next();
                   s2=s1;
                   System.out.print("The copied string is : "+s2);
                   break;
            default:System.out.print("Invalid choice");
            break;
        }

    }

}