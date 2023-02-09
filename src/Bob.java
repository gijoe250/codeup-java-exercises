import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        Scanner in = new Scanner(System.in);
        boolean chat = true;
        String speech = "";

        while(chat){
            System.out.println("Enter what you want to say to Bob or type \"exit\" to leave: ");
            speech = in.nextLine();

            if (speech.isEmpty()){
                System.out.println("Bob: Fine. Be that way!");
            }
            else if (speech.equals("exit")){
                System.out.println("You: See you later Bob");
                break;
            }
            else if (speech.charAt(speech.length() -1) == '?'){
                System.out.println("Bob: Sure.\n");
            }
            else if (speech.charAt(speech.length() -1) == '!') {
                System.out.println("Bob: Whoa, chill out!\n");
            }
            else {
                System.out.println("Bob: Whatever");
            }
        }
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
    }
}
