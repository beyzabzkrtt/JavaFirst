package nyp;

import java.util.ArrayList;

public class MyStack {
 public static void main(String[] args) {


    StackOlustur mystack = new StackOlustur();

    A a = new A(1);
    A a2 = new A(2);
    A a3 = new A(3);

    mystack.push(a);
    mystack.push(a2);
    mystack.push(a3);

    mystack.pop();

    mystack.yazdir();

    System.out.println(mystack.bosMu());

    System.out.println(mystack.elemanSayisi());
    
 }
}

class StackOlustur{

    private ArrayList<Object> liste;

    public StackOlustur(){
        liste = new ArrayList<>();
    }

    public int elemanSayisi(){
        return liste.size();
    }

    public boolean bosMu(){

        if(liste.size() == 0){
            return true;
        }else{
            return false;
        }
        //liste.isEmpty();
    }

    public Object sonElemanGoster(){
        return liste.get(elemanSayisi()-1);
    }

    public Object pop(){

        if(elemanSayisi()>0){
            Object donenEleman = liste.get(elemanSayisi()-1);
        liste.remove(donenEleman);
        return donenEleman;
        }else{
            System.out.println("yigin bos");
            return null; //geriye bir şey döndürmek zorunda olduğu için
        }
        
        
    }

    public void push(Object x){

        liste.add(x);

    }

    public void yazdir(){

        System.out.println("************ YİGİN İCERİGİ************");

        for(int i =0; i<liste.size();i++){
            System.out.println(i+" inci indexte "+liste.get(i));

        }
    }

}

class A{

    int id;

    public A(int id){
       this.id=id;
    }


    @Override
    public String toString() {
       
        return "a"+ id+" nesnesi";
}
}
