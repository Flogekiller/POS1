import com.sun.tools.javac.Main;

public class PrimeSieve implements EratosthenesPrimeSieve
{
    int obergraenze;


    public static void main(String[] args) {
        PrimeSieve primeSieve = new PrimeSieve(100);
        primeSieve.primeAlgorithmus();
        primeSieve.isPrime(19);
    }
    public PrimeSieve(int obergraenze)
    {
        this.obergraenze = obergraenze;
    }

    @Override
    public boolean isPrime(int p) {
        System.out.println(primeAlgorithmus()[p]);
       return primeAlgorithmus()[p];
    }

    @Override
    public void printPrimes() {

    }

    private boolean[] primeAlgorithmus()
    {
        boolean[] primeList = new boolean[obergraenze+1];
        for (int i = 1; i < obergraenze; i++) {
            primeList[i] = true;
            for (int j = 2; j+1 < i; j++) {
                if(i%j == 0)
                {
                   primeList[i] = false;
                   break;

                }
            }

        }
        return primeList;
    }
}
