class Arena {

    public static void main(String[] args) {
        
        // TODO : create two monsters

        FireMonster fireMonster = new FireMonster("Monstre de feu", 5);
        WaterMonster waterMonster = new WaterMonster("Monstre d'eau", 5);
        AirMonster airMonster = new AirMonster("Monstre d'air", 5);

        // TODO : monsters attack each other

        while(airMonster.getLife() > 0 && waterMonster.getLife() > 0){
            
            waterMonster.attack(airMonster);
            if(waterMonster.getLife() <= 0){
                break;
            }
            
            airMonster.attack(waterMonster);
            if(airMonster.getLife() <= 0){
                break;
            }
        }
        
    }
}