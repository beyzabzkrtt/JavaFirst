public class ForEtiketi {

  public static void main(String[] args) {

    ilkfor :
    for (int i = 0; i < 5; i++) {

        //sonfor :  
        for (int b = 0; b < 3; b++) {

            System.out.println("i : " + i + " b : " + b);
            if(i==1 && b==1) break ilkfor;

    // sadece break deseydik yazıldığı foru sonlandırırdı ve o anlık sonfor dan çıksa bile ilkfor dönmeye
    // devam ettiği için tekrar sonfor a girerdi böylece çıktı hiç break kullanılmamış gibi olurdu        
        
      }
    }
  }
}
