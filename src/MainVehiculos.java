public class MainVehiculos {
    public static void main(String[] args) {
        Coche Jaguar= new Coche ("1234ENG","Jaguar","TheRoadIsYours", 200000);
        Coche BMW= new Coche ("9065AME","BMW","LoveAtFirstDrive", 60000);
        Coche Lexus= new Coche ("5638DDD","Lexus","FastAndGlorious", 120000);
        Coche Austin= new Coche ("3564GER","Austin","BeLikeBond", 150000);
        Coche RomeoAlfaJulietta= new Coche ("4749JAV","RomeoAlfaJulietta","DramaMasterpiece", 12000);

        RegistroVehiculos registro = new RegistroVehiculos();
        registro.registrarVehiculo(Jaguar);
        registro.registrarVehiculo(BMW);
        registro.registrarVehiculo(Lexus);
        registro.registrarVehiculo(Austin);
        registro.registrarVehiculo(RomeoAlfaJulietta);
        // Debes comprobar que el HashSet no permite duplicados
        registro.registrarVehiculo(RomeoAlfaJulietta);

        System.out.println(registro.obtenerTodos());

        if(registro.obtenerVehiculo("4749JAV")!=null){
            System.out.println("Coche con matricula 4749JAV: " + registro.obtenerVehiculo("4749JAV"));
        }


        System.out.println("Lista vehiculos Lexus: " + registro.obtenerVehiculosMarca("Lexus"));


       /* registro
                .obtenerVehiculoPrecioMax()

              System.out.println("Coche Max precio: " + coche);
                */


        System.out.println("Coche con precio Mas alto: " + registro.obtenerVehiculoPrecioMax());

        System.out.println("Eliminando coche con matricula 1234ENG");
        registro.eliminarVehiculo("1234ENG");

        System.out.println(registro.obtenerTodos());


    }
}
