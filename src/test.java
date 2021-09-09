class TestConsole {
    public static void main(String[] args) {
        String sampleString = "Cat  Dog    Elephant     Fox";
        String[] animals = sampleString.split("\\s");
        int animalIndex = 1;
        for (String animal : animals) {
            System.out.println(animalIndex + ". " + animal);
            animalIndex++;
        }
    }
}