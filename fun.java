import java.lang.Math;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class fun {
        public static void main(String[] args) {
                for (int i = 0; i < 5; i++) {
                        String[][] Fname = {
                                        /* 1 */ { "James", "Robert", "John", "Michael", "Maria", "Mohammed", "Jose",
                                                        "Muhammad",
                                                        "Wei", "Ahmed" },
                                        /* 2 */ { "Yan", "Ali", "David", "Li", "Abdul", "Ana", "Ying",
                                                        "Juan", "Anna", "Mary" },
                                        /* 3 */ { "Jean", "Daniel", "Luis", "Carlos", "Antonio", "Joseph", "Hui",
                                                        "Elena",
                                                        "Francisco", "Hong" },
                                        /* 4 */ { "Min", "Lei", "Yu", "Ibrahim", "Peter", "Fatima", "Brian", "Richard",
                                                        "Xin", "Bin" },
                                        /* 5 */ { "Paul", "Ping", "Lin", "Olga", "Sri", "Pedro", "William",
                                                        "Rosa", "Thomas", "Jorge" },
                                        /* 6 */ { "Yong", "Elizabeth", "Sergey", "Ram", "Patricia", "Hassan", "Anita",
                                                        "Manuel", "Victor", "Sandra" },
                                        /* 7 */ { "Ming", "Siti", "Miguel", "Emmanuel", "Samuel", "Ling", "Charles",
                                                        "Sarah", "Mario", "Joao" },
                                        /* 8 */ { "Tatyana", "Mark", "Rita", "Martin", "Svetlana", "Patrick", "Natalya",
                                                        "Qing", "Ahmad", "Martha" },
                                        /* 9 */ { "Andrey", "Sunita", "Andrea", "Christine", "Irina", "Laura", "Linda",
                                                        "Marina", "Carmen", "Ghulam" },
                                        /* 10 */ { "Vladimir", "Barbara", "Angela", "George", "Roberto", "Peng", "Ivan",
                                                        "Alexander", "Ekaterina", "Qiang" } };
                        String[][] Lname = {
                                        /* 1 */ { "Wang", "Li", "Zhang", "Chen", "Liu", "Devi", "Yang", "Huang",
                                                        "Singh", "Wu" },
                                        /* 2 */ { "Kumar", "Xu", "Zhao", "Zhou", "Nguyen", "Khan", "Ma",
                                                        "Lu", "Zhu", "Maung" },
                                        /* 3 */ { "Sun", "Yu", "Lin", "Kim", "He", "Hu", "Jiang", "Guo",
                                                        "Khatun", "Luo" },
                                        /* 4 */ { "Akter", "Gao", "Zheng", "da Silva", "Tang", "Liang", "Das", "Wei",
                                                        "Smith", "Shi" },
                                        /* 5 */ { "Song", "Xie", "Han", "Garcia", "Tan", "Deng", "Bai",
                                                        "Yan", "Kaur", "Feng" },
                                        /* 6 */ { "Hernandez", "Rodriguez", "Cao", "Lopez", "Hussain", "Gonzalez",
                                                        "Martinez",
                                                        "Ceng", "Peng", "Cai" },
                                        /* 7 */ { "Xiao", "Tran", "Pan", "Cheng", "Yuan", "Rahman", "Yadav",
                                                        "Su", "Perez", "Le" },
                                        /* 8 */ { "Fan", "Dong", "Ye", "Ram", "Tian", "Fu", "Hossain",
                                                        "Kumari", "Sanchez", "Du" },
                                        /* 9 */ { "Pereira", "Yao", "Zhong", "Jin", "Pak", "Ding", "Lal",
                                                        "Yin", "Bibi", "Silva" },
                                        /* 10 */ { "Ren", "Ferreira", "Liao", "Mandal", "Cui", "Begum", "Fang",
                                                        "Sharma", "Alves", "Shah" } };
                        String[][] Animail = {
                                        /* 1 */ { "buffalo", "bat", "bull", "pufferfish", "marlin", "penguin", "jay",
                                                        "pigeon",
                                                        "tadpole", "viper" },
                                        /* 2 */ { "tortoise", "toad", "dolphin", "donkey", "elephant", "reindeer",
                                                        "panther",
                                                        "rhino", "lynx", "baboon" },
                                        /* 3 */ { "cheetah", "lion", "panda", "squirrel", "fox", "lemur", "alpaca",
                                                        "dog",
                                                        "dolphin", "gorilla" },
                                        /* 4 */ { "goldfish", "stringray", "swordfish", "piranha", "butterflyfish",
                                                        "kissingfish", "cobia", "lionfish", "clownfish", "eel" },
                                        /* 5 */ { "zebra", "pig", "woodpecker", "hummingbird", "robin", "flamingo",
                                                        "toucan",
                                                        "spoonbill", "bluebird", "cardinal" },
                                        /* 6 */ { "crocodile", "cobra", "frog", "turtle", "snake", "gecko", "lizard",
                                                        "newt", "numbat", "tiger" },
                                        /* 7 */ { "cat", "wolf", "crane", "crow", "dove", "cormorant", "duck",
                                                        "eagle", "hen", "magpie" },
                                        /* 8 */ { "ostrich", "parrot", "peacock", "pelican", "raven", "rooster",
                                                        "seagull",
                                                        "sparrow", "swallow", "turkey" },
                                        /* 9 */ { "vulture", "barracuda", "bass", "bluetang", "bluefish", "catfish",
                                                        "cod",
                                                        "dolphin", "greymullet", "mackerel" },
                                        /* 10 */ { "trout", "snapper", "sockeye", "pike", "marlin", "betta", "cammel",
                                                        "leopard", "monkey", "skunk" } };
                        String[][] Ad1 = {
                                        /* 1 */ { "angry", "bad", "big", "bitter", "black", "bloody", "bold", "bossy",
                                                        "brave",
                                                        "bright" },
                                        /* 2 */ { "cheap", "chubby", "cold", "cool", "crazy", "crunchy", "deep",
                                                        "dense",
                                                        "dirty", "dry" },
                                        /* 3 */ { "dull", "curvy", "dumb", "easy", "early", "fancy", "fat", "filthy",
                                                        "fine",
                                                        "firm" },
                                        /* 4 */ { "flat", "fresh", "hot", "large", "lazy", "noisy", "old", "plain",
                                                        "poor",
                                                        "pretty" },
                                        /* 5 */ { "proud", "quick", "quite", "rare", "skinny", "sleepy", "slim", "slow",
                                                        "slimy", "smart" },
                                        /* 6 */ { "small", "smelly", "smokey", "soft", "lucky", "defeated", "dashing",
                                                        "frantic", "zippy",
                                                        "vast" },
                                        /* 7 */ { "upset", "weary", "zealous", "creepy", "happy", "lethal", "pleasant",
                                                        "hollow", "naughty",
                                                        "nasty" },
                                        /* 8 */ { "ideal", "rotten", "decayed", "cruel", "cheerful", "huge", "horrific",
                                                        "jealous", "jittery",
                                                        "shaggy" },
                                        /* 9 */ { "devious", "defiant", "cloudy", "average", "disturbed", "dizzy",
                                                        "fuzzy",
                                                        "funny", "high",
                                                        "helpless" },
                                        /* 10 */ { "petty", "scary", "terrible", "testy", "tricky", "poised", "clumsy",
                                                        "greasy", "burly",
                                                        "batty" } };
                        String[][] Ad2 = {
                                        /* 1 */ { "angry", "bad", "big", "bitter", "black", "bloody", "bold", "bossy",
                                                        "brave",
                                                        "bright" },
                                        /* 2 */ { "cheap", "chubby", "cold", "cool", "crazy", "crunchy", "deep",
                                                        "dense",
                                                        "dirty", "dry" },
                                        /* 3 */ { "dull", "curvy", "dumb", "easy", "early", "fancy", "fat", "filthy",
                                                        "fine",
                                                        "firm" },
                                        /* 4 */ { "flat", "fresh", "hot", "large", "lazy", "noisy", "old", "plain",
                                                        "poor",
                                                        "pretty" },
                                        /* 5 */ { "proud", "quick", "quite", "rare", "skinny", "sleepy", "slim", "slow",
                                                        "slimy", "smart" },
                                        /* 6 */ { "small", "smelly", "smokey", "soft", "lucky", "defeated", "dashing",
                                                        "frantic", "zippy", "vast" },
                                        /* 7 */ { "upset", "weary", "zealous", "creepy", "happy", "lethal", "pleasant",
                                                        "hollow", "naughty", "nasty" },
                                        /* 8 */ { "ideal", "rotten", "decayed", "cruel", "cheerful", "huge", "horrific",
                                                        "jealous", "jittery", "shaggy" },
                                        /* 9 */ { "devious", "defiant", "cloudy", "average", "disturbed", "dizzy",
                                                        "fuzzy",
                                                        "funny", "high", "helpless" },
                                        /* 10 */ { "petty", "scary", "terrible", "testy", "tricky", "poised", "clumsy",
                                                        "greasy", "burly", "batty" } };
                        String[] Country = { "United States", "Canada" };
                        int Arr1 = (int) (Math.random() * 10);
                        int Arr2 = (int) (Math.random() * 10);
                        int Arr3 = (int) (Math.random() * 10);
                        int Arr4 = (int) (Math.random() * 10);
                        int Na1 = (int) (Math.random() * 10);
                        int Na2 = (int) (Math.random() * 10);
                        int FN1 = (int) (Math.random() * 10);
                        int FN2 = (int) (Math.random() * 10);
                        int LN1 = (int) (Math.random() * 10);
                        int LN2 = (int) (Math.random() * 10);
                        int C4 = (int) ((Math.random() * 2));
                        System.out.println(Fname[FN1][FN2] + ", " + Lname[LN1][LN2]);
                        System.out.println(Ad1[Arr1][Arr2] + Ad2[Arr3][Arr4] + Animail[Na1][Na2]);
                        System.out.println(Country[C4]);
                        BD();
                        RegPass();
                        RndPass();
                        System.out.println();
                        System.out.println();
                        try {
                                TimeUnit.SECONDS.sleep(5);
                        } catch (InterruptedException ex) {
                                ex.printStackTrace();
                        }
                }
        };

        static void BD() {
                int mon = (int) (Math.random() * 11);
                String[] Month = {
                                "January", "Feburary", "March", "April", "May", "June", "July", "August", "September",
                                "October",
                                "November", "December" };
                int day = (int) (Math.random() * 27);
                int minus = (int) (Math.random() * 26) + 13;
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.YEAR, -minus);
                System.out.println(Month[mon] + ", " + day + ", " + calendar.get(Calendar.YEAR));

        }

        static void RegPass() {
                String[][] Describ = {
                                /* 1 */ { "Active", "Adaptable", "Adventurous", "Amusing", "Brave", "Bright", "Calm",
                                                "Careful", "Charming", "Compassionate" },
                                /* 2 */ { "Considerate", "Courageous", "Courteous", "Creative", "Determined",
                                                "Diligent", "Discreet", "Dynamic", "Energetic", "Fearless" },
                                /* 3 */ { "Friendly", "Funny", "Gentle", "Helpful", "Generous", "Honest", "Humourous",
                                                "Imaginative", "Intelligent", "Inventive" },
                                /* 4 */ { "Joyful", "Kind", "Loving", "Loyal", "Lucky", "Mature", "Motivated", "Neat",
                                                "Nice", "Optimistic" },
                                /* 5 */ { "Passionate", "Patient", "Polite", "Popular", "Powerful", "Practical",
                                                "Rational",
                                                "Realistic", "Reliable", "Resourceful" },
                                /* 6 */ { "Sensible", "Sincere", "Smart", "Socialable", "Smart", "Fast", "Fat",
                                                "Cool", "Rotten", "Dirty" },
                                /* 7 */ { "Upset", "Weary", "Zealous", "Creepy", "Happy", "Lethal", "Pleasant",
                                                "Hollow", "Naughty", "Nasty" },
                                /* 8 */ { "Ideal", "Rotten", "Decayed", "Cruel", "Cheerful", "Huge", "Horrific",
                                                "Jealous", "Jittery", "Shaggy" },
                                /* 9 */ { "Devious", "Defiant", "Cloudy", "Average", "Disturbed", "Dizzy",
                                                "Fuzzy", "Funny", "High", "Helpless" },
                                /* 10 */ { "Petty", "Scary", "Terrible", "Testy", "Tricky", "Poised", "Clumsy",
                                                "Greasy", "Burly", "Batty" } };
                String[][] Animail = {
                                /* 1 */ { "buffalo", "bat", "bull", "pufferfish", "marlin", "penguin", "jay",
                                                "pigeon",
                                                "tadpole", "viper" },
                                /* 2 */ { "tortoise", "toad", "dolphin", "donkey", "elephant", "reindeer",
                                                "panther",
                                                "rhino", "lynx", "baboon" },
                                /* 3 */ { "cheetah", "lion", "panda", "squirrel", "fox", "lemur", "alpaca",
                                                "dog",
                                                "dolphin", "gorilla" },
                                /* 4 */ { "goldfish", "stringray", "swordfish", "piranha", "butterflyfish",
                                                "kissingfish", "cobia", "lionfish", "clownfish", "eel" },
                                /* 5 */ { "zebra", "pig", "woodpecker", "hummingbird", "robin", "flamingo",
                                                "toucan",
                                                "spoonbill", "bluebird", "cardinal" },
                                /* 6 */ { "crocodile", "cobra", "frog", "turtle", "snake", "gecko", "lizard",
                                                "newt", "numbat", "tiger" },
                                /* 7 */ { "cat", "wolf", "crane", "crow", "dove", "cormorant", "duck",
                                                "eagle", "hen", "magpie" },
                                /* 8 */ { "ostrich", "parrot", "peacock", "pelican", "raven", "rooster",
                                                "seagull",
                                                "sparrow", "swallow", "turkey" },
                                /* 9 */ { "vulture", "barracuda", "bass", "bluetang", "bluefish", "catfish",
                                                "cod",
                                                "dolphin", "greymullet", "mackerel" },
                                /* 10 */ { "trout", "snapper", "sockeye", "pike", "marlin", "betta", "cammel",
                                                "leopard", "monkey", "skunk" } };
                int Des1 = (int) (Math.random() * 10);
                int Des2 = (int) (Math.random() * 10);
                int Ani1 = (int) (Math.random() * 10);
                int Ani2 = (int) (Math.random() * 10);
                int Numb11 = (int) (Math.random() * 8);
                int Numb12 = (int) (Math.random() * 8);
                System.out.println(Describ[Des1][Des2] + Animail[Ani1][Ani2] + Numb11 + Numb12);
        };

        static void RndPass() {
                for (int i = 0; i < 9; i++) {
                        int P1 = (int) (Math.random() * 25);
                        char[] Con = {
                                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                                        'q',
                                        'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
                        };
                        System.out.print(Con[P1]);
                }
                for (int f = 0; f < 2; f++) {
                        int Numb = (int) (Math.random() * 8);
                        System.out.print(Numb);
                }

        }
}