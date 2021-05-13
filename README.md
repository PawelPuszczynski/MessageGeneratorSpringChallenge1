# MessageGeneratorSpringChallenge1
Java Spring Tutorial Masterclass 1st Challenge solution
Create an interface MessageGenerator with 2 methods from the class diagram (coming up on the next slide).

Create a class MessageGeneratorImpl and implement methods to return any String (e.g. "calling method xxx").

In MessageGeneratorImpl 
	add a logger.
	add a field of type Game and autowire it
	add a field guessCount (int) and initialize it to 10 for now (we will change this later).
	add a @PostConstruct method and log value of game to confirm it was autowired e.g. not null.

Create a bean method (in AppConfig) that will create a MessageGenerator.

In the main method get the MessageGenerator bean and call both methods.

Check the console output and confirm that both methods are called.
