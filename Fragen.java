public class Fragen {
  
  private String[] questions;
  private String[][] answers;
  private int[] correctAnswers;
  
  public Fragen() {
    questions = new String[]{
    "What is the capital of France?",
    "Which planet is called the red planet?",
    "What animal is the largest one on earth?",
    "Which of the following historical figures had the greatest influence on modern physics?",
    "Wer ist der Hurensohn?",
    "Who wrote 'To Kill a Mockingbird'?",
    "What is the capital of Japan?",
    "What is the chemical symbol for oxygen?",
    "Who discovered penicillin?",
    "What is the tallest mountain in the world?",
    "What is the primary language spoken in Brazil?",
    "Who composed the 'Moonlight Sonata'?",
    "What is the largest mammal in the world?",
    "What is the hardest natural substance on Earth?",
    "What is the currency of Germany?",
    "Who developed the theory of relativity?",
    "What is the process by which plants make their own food called?",
    "Who painted 'Starry Night'?",
    "What is the smallest country in the world?",
    "What is the largest desert in the world?",
    "What is the chemical symbol for sodium?",
    "Who wrote 'Hamlet'?",
    "What is the capital of Australia?",
    "What is the most populous country in the world?",
    "What is the highest waterfall in the world?",
    "What is the chemical symbol for hydrogen?",
    "Who is known as the 'Father of Computers'?",
    "What is the main component of air?",
    "What is the hardest natural substance on Earth?",
    "What is the speed of light in a vacuum?"
    };
    
    answers = new String[][]{
    {"Rome", "Madrid", "Paris", "Berlin"},
    {"Venus", "Mars", "Jupiter", "Earth"},
    {"Elephant", "Blue Whale", "Lion", "Rhino"},
    {"Isaac Newton", "Albert Einstein", "Galileo Galilei", "Marie Curie"},
    {"Hans", "Peter", "Max", "Juliane Becker"},
    {"Harper Lee", "Mark Twain", "F. Scott Fitzgerald", "J.K. Rowling"},
    {"Tokyo", "Kyoto", "Osaka", "Hiroshima"},
    {"O", "Ox", "Oxg", "Oxy"},
    {"Alexander Fleming", "Louis Pasteur", "Marie Curie", "Isaac Newton"},
    {"Mount Everest", "K2", "Kangchenjunga", "Lhotse"},
    {"Portuguese", "Spanish", "French", "German"},
    {"Ludwig van Beethoven", "Johann Sebastian Bach", "Wolfgang Amadeus Mozart", "Franz Schubert"},
    {"Blue Whale", "African Elephant", "Giraffe", "Hippopotamus"},
    {"Diamond", "Gold", "Platinum", "Titanium"},
    {"Euro", "Dollar", "Pound", "Yen"},
    {"Albert Einstein", "Isaac Newton", "Stephen Hawking", "Niels Bohr"},
    {"Photosynthesis", "Respiration", "Digestion", "Fermentation"},
    {"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Michelangelo"},
    {"Vatican City", "Monaco", "Nauru", "Maldives"},
    {"Antarctica", "Sahara", "Arabian", "Gobi"},
    {"Na", "S", "H", "Mg"},
    {"William Shakespeare", "Charles Dickens", "Jane Austen", "George Orwell"},
    {"Canberra", "Sydney", "Melbourne", "Brisbane"},
    {"China", "India", "United States", "Indonesia"},
    {"Angel Falls", "Niagara Falls", "Victoria Falls", "Iguazu Falls"},
    {"H", "He", "Hg", "Hy"},
    {"Charles Babbage", "Alan Turing", "Ada Lovelace", "John von Neumann"},
    {"Nitrogen", "Oxygen", "Carbon Dioxide", "Helium"},
    {"Diamond", "Gold", "Platinum", "Titanium"},
    {"299.792.458 meters per second", "1.000.000 meter per hour", "154.676.576 meters per second", "Gontschs Höchstgeschwindigkeit"}
    };
    
    correctAnswers = new int[]{3, 2, 2, 2, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
  }
  
  public String[] getQuestions() {
    return questions;
  }
  
  public String[][] getAnswers() {
    return answers;
  }
  
  public int[] getCorrectAnswers() {
    return correctAnswers;
  }
  
  // Fürs Testen 
  public static void main(String[] args) {
    Fragen quiz = new Fragen();
    
    // ausgeben Fragen und Antworten
    for (int i = 0; i < quiz.getQuestions().length; i++) {
      System.out.println("Question " + (i + 1) + ": " + quiz.getQuestions()[i]);
      for (int j = 0; j < quiz.getAnswers()[i].length; j++) {
        System.out.println("  Option " + (j + 1) + ": " + quiz.getAnswers()[i][j]);
      }
      System.out.println("Correct Answer: Option " + quiz.getCorrectAnswers()[i]);
      System.out.println();
    }    
  }
}
