public class Kalkulator {
    double angka1;
    double angka2;

    public Kalkulator(double number1, double number2) {
        this.angka1 = number1;
        this.angka2 = number2;
    }

    public double tambah(){
        return angka1 + angka2;
    }

    public double kurang(){
        return angka1 - angka2;
    }

    public double kali(){
        return angka1 * angka2;
    }

    public double bagi(){
        if(angka2 != 0){
            return angka1 / angka2;
        }
        else {
            System.out.println("Error. Angka tidak bisa dibagi dengan 0.");
            return 0;
        }
    }
}
