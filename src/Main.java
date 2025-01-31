//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            int numero=10;
            if (numero>5){
                System.out.println("El numero es mayor");

            }
            else {
                System.out.println("El numero es menor");
            }
            System.out.println("Esto es un for");
            for (int i=1;i<=10;i++)
            {
                System.out.println(i);
            }
        {

            char letra = 'A';
            switch (letra){
                case 'A':
                    System.out.println("Letra A");
                    break;
                case 'B':
                    System.out.println("Letra B");
                    break;
                case 'C':
                    System.out.println("Letra C");
                    break;
                case 'D':
                    System.out.println("Letra D");
                    break;

            }
            System.out.println("Cuenta Regresiva");
            int contador = 10;

            while (contador>0){
            contador--;
            System.out.println(contador);
            }


            System.out.println("Imprimir al menos una vez");
            int numero2=0;
            do {
                numero2++;
                System.out.println(numero2);
            }
            while (numero2<10);
        }
    }
}
