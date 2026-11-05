public class Main {
    public static void main(String[] args) {


        BoardGame[] boardGames = new BoardGame[3];
        boardGames[0] = new BoardGame("Шахматы", 2);
        boardGames[1] = new BoardGame("Монополия", 4);
        boardGames[2] = new BoardGame("Уно", 6);

        VideoGame[] videoGames = new VideoGame[2];
        videoGames[0] = new VideoGame("Minecraft", "PC");
        videoGames[1] = new VideoGame("God of War", "PlayStation");

        for (int i = 0; i < boardGames.length; i++) {
            boardGames[i].play();
            boardGames[i].save();
            boardGames[i].stop();
            System.out.println();
        }

        for (int i = 0; i < videoGames.length; i++) {
            videoGames[i].play();
            videoGames[i].save();
            videoGames[i].stop();
            System.out.println();

        }

    }


}