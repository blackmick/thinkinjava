class Parcel2{
    class Content{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String des;
        public Destination(String s){
            this.des = s;
        }

        public String value(){return this.des;}
    }

    public Content contents(){
        return new Content();
    }

    public Destination to(String des){
        return new Destination(des);
    }

    public Destination ship(String des){
        return new Destination(des);
    }

    public static void main(String [] args){

    }
}
