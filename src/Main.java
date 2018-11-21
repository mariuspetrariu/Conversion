import java.util.Scanner;

public class Main
    {
        private static Scanner scanner = new Scanner ( System.in );

        public static void main ( String[] args )
            {
                SuperClass superClass = new SuperClass ( );
                SubClass subClass = new SubClass ( );
                subClass.method ( );
//                subClass = ( SubClass ) superClass;
//                subClass.method ( );
//
                superClass = subClass;
                superClass.method ( );
            }
    }
