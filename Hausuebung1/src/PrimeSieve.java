import com.sun.tools.javac.Main;

public class PrimeSieve implements EratosthenesPrimeSieve
{
    int obergraenze;


    public static void main(String[] args) {
        PrimeSieve primeSieve = new PrimeSieve(100);
        primeSieve.primeAlgorithmus();
    }
    public PrimeSieve(int obergraenze)
    {
        this.obergraenze = obergraenze;
    }

    @Override
    public boolean isPrime(int p) {
        
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
            System.out.println(i + " " + primeList[i]);
        }
        return primeList;
    }
}
