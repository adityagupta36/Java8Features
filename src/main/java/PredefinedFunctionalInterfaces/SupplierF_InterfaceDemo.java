package PredefinedFunctionalInterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/*class SupplierImpl implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}*/
public class SupplierF_InterfaceDemo {
    public static void main(String[] args) {

/*        Supplier<LocalDateTime> supplier = new SupplierImpl();
        System.out.println(supplier.get());*/



        Supplier<LocalDateTime> supplier = () -> { return LocalDateTime.now(); };
        System.out.println(supplier.get());
    }
}
