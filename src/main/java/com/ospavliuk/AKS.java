package com.ospavliuk;

import java.math.*;
// 91009

public class AKS {
    private boolean sieveArray[];
    private int SIEVE_ERATOS_SIZE = 100000000;
    int counterI, counterJ;

    public AKS() {
        sieveEratos();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        AKS aks = new AKS();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(aks.isPrime(BigInteger.valueOf(91009)));
        System.out.println(System.currentTimeMillis() - start);
    }

    public boolean isPrime(int n) {
        return isPrime(BigInteger.valueOf(n));
    }

    public boolean isPrime(BigInteger n) {
        BigInteger lowR, powOf, x, leftH, rightH, aBigNum;
        int totR, quot, tm, aCounter, aLimit, divisor;
        int log = logBigInt(n);
        if (findPower(n, log)) {
            return false;
        }
        lowR = new BigInteger("2");
        x = lowR;
        totR = lowR.intValue();
        for (lowR = new BigInteger("2");
             lowR.compareTo(n) < 0;
             lowR = lowR.add(BigInteger.ONE)) {
            if ((lowR.gcd(n)).compareTo(BigInteger.ONE) != 0) {
                return false;
            }
            if (!sieveArray[totR]) {
                quot = largesFactor(totR - 1);
                divisor = (totR - 1) / quot;
                tm = (int) (4 * (Math.sqrt(totR)) * log);
                powOf = mPower(n, new BigInteger("" + divisor), lowR);
                if (quot >= tm && (powOf.compareTo(BigInteger.ONE)) != 0) {
                    break;
                }
            }
        }
        aLimit = (int) (2 * Math.sqrt(totR) * log);
        for (aCounter = 1; aCounter < aLimit; aCounter++) {
            aBigNum = new BigInteger("" + aCounter);
            leftH = (mPower(x.subtract(aBigNum), n, n)).mod(n);
            rightH = (mPower(x, n, n).subtract(aBigNum)).mod(n);
            if (leftH.compareTo(rightH) != 0) return false;
        }
        return true;
    }

    private int logBigInt(BigInteger bNum) {
        String str = "." + bNum.toString();
        return (int) (Math.log10(Double.parseDouble(str)) + str.length() - 1);
    }

    private int largestFactor(int num) {
        int i = num;
        if (i == 1) {
            return i;
        }
        while (i > 1) {
            while (sieveArray[i]) {
                i--;
            }
            if (num % i == 0) {
                return i;
            }
            i--;
        }
        return num;
    }

    private int largesFactor(int num) {
        if (num == 1) {
            return 1;
        }
        for (int i = num; i > 1; i--) {
            if (sieveArray[i]) {
                continue;
            }
            if (num % i == 0) {
                return i;
            }
        }
        return num;
    }

    private boolean findPowerOf(BigInteger bNum, int val) {
        int l;
        double len;
        BigInteger low, high, mid, res;
        low = new BigInteger("10");
        high = new BigInteger("10");
        len = (bNum.toString().length()) / val;
        l = (int) Math.ceil(len);
        low = low.pow(l - 1);
        high = high.pow(l).subtract(BigInteger.ONE);
        while (low.compareTo(high) <= 0) {
            mid = low.add(high);
            mid = mid.divide(new BigInteger("2"));
            res = mid.pow(val);
            if (res.compareTo(bNum) < 0) {
                low = mid.add(BigInteger.ONE);
            } else if (res.compareTo(bNum) > 0) {
                high = mid.subtract(BigInteger.ONE);
            } else if (res.compareTo(bNum) == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean findPower(BigInteger n, int l) {
        int i;
        for (i = 2; i < l; i++) {
            if (findPowerOf(n, i)) {
                return true;
            }
        }
        return false;
    }

    private BigInteger mPower(BigInteger x, BigInteger y, BigInteger z) {
        BigInteger out, two = BigInteger.valueOf(2);
        out = BigInteger.ONE;
        while (y.signum() > 0) {
            while (((y.mod(two)).compareTo(BigInteger.ZERO)) == 0) {
                y = y.divide(two);
                x = (x.multiply(x)).mod(z);
            }
            y = y.subtract(BigInteger.ONE);
            out = (out.multiply(x)).mod(z);
        }
        return out;
    }

    private void sieveEratos() {
        sieveArray = new boolean[SIEVE_ERATOS_SIZE + 1];
        sieveArray[1] = true;
        for (int i = 2; i * i <= SIEVE_ERATOS_SIZE; i++) {
            counterI++;
            if (!sieveArray[i]) {
                for (int j = i * i; j <= SIEVE_ERATOS_SIZE; j += i) {
                    sieveArray[j] = true;
                    counterJ++;
                }
            }
        }
        System.out.println(" I" + counterI + " J" + counterJ);
    }
}