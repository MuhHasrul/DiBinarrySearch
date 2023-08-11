// import java.util.Objects;
import java.util.Scanner;

public class BinarrySearch {

    public static void main(String[] args) {

        // Data array untuk menyimpan NIM dan nama mahasiswa
        Long[] nim = {
                105841113822L,//0
                105841113922L,//1
                105841114022L,//2
                105841114122L,//3
                105841114222L,//4
                105841114322L,//5
                105841114422L,//6
                105841114522L,//7
                105841114622L,//8
                105841114722L,//9
                105841114822L,//10
                105841114922L,//11
        };

        String[] nama = {
                "Abdullah Khaeruna Anwar",//0
                "Muh. Irsyad Jafar",//1
                "Alryadi Asmu'adzan",//2
                "Muhammad Aditya Yudistira",//3
                "Wiwin Fuad Sanjaya ",//4
                "Muh. Ayyub Hasrul",//5
                "Muhammad Alif Syaffan",//6
                "Muh. Imam Ma'ruf Musni",//7
                "Muhammad Abdillah Zufar",//8
                "Mutiara ",//9
                "M. Fahmi Zulhidayat",//10
                "Muh. Hasrul",//11
        };

        int[] umur = {19, 19, 19, 19, 19, 19, 19, 20, 19, 19, 19, 21,};

        // Mencari nama berdasarkan input NIM
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        Long searchKey = input.nextLong();

        int rendah = 0;
        int tinggi = nim.length - 1;
        int mid;
        boolean found = false;
        int count = 0;


//        System.out.println("=================Dengan Binarry Search=================");
        while (rendah <= tinggi && !found) {
            count++;
            mid = (rendah + tinggi) / 2;
            if (nim[mid] < searchKey) {
                rendah = mid + 1;
            } else if (nim[mid] > searchKey) {
                tinggi = mid - 1;
            } else {
                System.out.println(" Nama: " + nama[mid] + "\n NIM :" + nim[mid] + "\n Umur :" + umur[mid] + "Tahun");
                found = true;
            }
        }
        if (!found) {
            System.out.println("NIM tidak ditemukan.");
        }
        System.out.println("=================Dengan Binarry Search=================");
        System.out.println("==========================================");
        System.out.println("Berulang sebanyak : " + count);


       System.out.println("=======Dengan Binarry Search Dengan Kemungkinan Terburuknya Kecil=======");

        rendah = 0;
        tinggi = nim.length - 1;

        found = false;
        count = 0;

        while (rendah <= tinggi && !found) {
            count++;
            int rendah1 = rendah;
            int tinggi1 = tinggi;
            mid = (rendah + tinggi) / 2;

            if (nim[rendah1].equals(searchKey)) {
                System.out.println(" Nama :" + nama[rendah1] + "\n NIM :" + nim[rendah1] + "\n Umur :" + umur[rendah1] + " Tahun");
                found = true;
                break;
            } else if (nim[tinggi1].equals(searchKey)) {
                System.out.println(" Nama :" + nama[tinggi1] + "\n NIM :" + nim[tinggi1] + "\n Umur :" + umur[tinggi1] + " Tahun");
                found = true;
                break;
            } else if (nim[mid] < searchKey) {
                rendah = mid + 1;
                tinggi--;
            } else if (nim[mid] > searchKey) {
                rendah++;
                tinggi = mid - 1;
            } else {
                System.out.println(" Nama: " + nama[mid] + "\n NIM :" + nim[mid] + "\n Umur :" + umur[mid] + "Tahun");
                found = true;
            }
        }

        if (!found) {
            System.out.println("NIM tidak ditemukan.");
        }
        System.out.println("=======Dengan Binarry Search Dengan Kemungkinan Terburuknya Kecil=======");
        System.out.println("==========================================");
        System.out.println("Berulang sebanyak : " + count);

        input.close();

    }

}