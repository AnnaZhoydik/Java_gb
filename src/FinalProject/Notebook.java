package FinalProject;
 public class Notebook {
        String brand;
        String model;
        int ram;
        int hardDisk;
        String operSystem;
        String color;

        // Конструктор
        public Notebook(String brand, String model, int ram, int hardDisk, String operSystem, String color){
            this.brand = brand.toUpperCase();
            this.model = model.toUpperCase();
            this.ram = ram;
            this.hardDisk = hardDisk;
            this.operSystem = operSystem.toUpperCase();
            this.color = color.toLowerCase();
        }

        public int getRam() {
            return ram;
        }
        public int getHardDisk() {
            return hardDisk;
        }
        public String getOperSystem() {
            return operSystem;
        }
        public String getColor() {
            return color;
        }

        public void showInfo(){
            System.out.println(String.format("Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n",
                    this.brand, this.model, this.ram, this.hardDisk, this.operSystem, this.color));
        }
    }
