class multiply {
    static int multi(int a, int b) {
        return a * b;
    }

    static int multi(int a, int b, int c) {
        return a * b * c;
    }
}

class overloading {
    public static void main(String[] args) {
        System.out.println(multiply.multi(11, 11));
        System.out.println(multiply.multi(11, 11, 11));
    }
}