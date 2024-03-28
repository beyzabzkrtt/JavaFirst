
public class IkiBoyutluDiziGezme {
    public static void main(String[] args) {
        
        int dizi[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int satir =0 ; satir < dizi.length ; satir++){ // dizi.length satır sayısını verir
 
            for(int sutun =0; sutun< dizi[satir].length; sutun++){ // dizinin o anki satırının uzunluğu

                System.out.println("dizinin "+(satir+1)+" satir "+(sutun+1)+" sutundaki elemani : "+dizi[satir][sutun]);
            }
        }
    }
    
}
