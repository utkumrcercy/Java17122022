public class MutableImMutable {

    /**
     *  Immutable Değişmez
     *  Mutable Değişebilir
     */

    public static void main(String[] args) {


        ImmutableOrnek immutableOrnek = new ImmutableOrnek();

        System.out.println(immutableOrnek.getImmutableList());

        //Immutable olduğundan Ali' yi eklemez
        immutableOrnek.getImmutableList().add("ALi");
        System.out.println(immutableOrnek.getImmutableList());


    }
}
