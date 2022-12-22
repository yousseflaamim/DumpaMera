
//abstract class
public abstract class  Parking {
        private String nameParking;
        private int SizeParking;

        public Parking() {

        }

        public abstract void NameParking() ;



        public void setNameParking(String nameParking) {
                this.nameParking = nameParking;
        }

        public int getSizeParking() {
                return SizeParking;
        }

        public void setSizeParking(int sizeParking) {
                SizeParking = sizeParking;
        }

        @Override
        public String toString() {
                return "Parking{" +
                        "nameParking='" + nameParking + '\'' +
                        ", SizeParking=" + SizeParking +
                        '}';
        }
}








