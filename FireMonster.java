class FireMonster extends Monster{

    // TODO : add constructor and initialize type to "fire"

    public FireMonster(String name, int attack){
        super(name, attack, "Fire");
    }
    
    // TODO : create an attack method which deals x2 damage to "air"

    @Override
    public boolean attack(Monster opponent){
        int opponentCurrentLife = opponent.getLife();
        String opponentType = opponent.getType();

        if(opponentType.equals("Air")){
            opponent.setLife(opponentCurrentLife - this.getAttack()*2);
        } else {
            opponent.setLife(opponentCurrentLife - this.getAttack());
        }
        
        return opponent.isKO();
    }
    
}