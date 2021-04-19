package com.example.happybirthday

object Constants{

    const val USER_NAME: String = "user_name"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
                1,
                "What three words best describe your personality?",
                "Fun, playful and friendly",
                "Creative, decisive and clever",
                "Chill, easy-going, and laid-back",
                "Passionate, emotional and protective",
                2,
                3,
                1,
                4

        )

        questionsList.add(que1)

        //2
        val que2 = Question(
                2,
                "Which of these animals do you like the most?",
                "Dogs",
                "Horses",
                "Butterflies",
                "Dolphins",
                1,
                4,
                3,
                2
        )

        questionsList.add(que2)

        //3
        val que3 = Question(
                3,
                "Which color combo do you like the most?",
                "Black and brown",
                "Blue and green",
                "Red and orange",
                "Green and purple",
                1,
                2,
                4,
                3
        )

        questionsList.add(que3)

        //4
        val que4 = Question(
                4,
                "What's your favorite movie genre?",
                "Thriller, mystery, horror",
                "Comedy or action movies",
                "Adventure and romantic",
                "Drama or educational documentaries",
                4,
                1,
                2,
                3
        )

        questionsList.add(que4)

        //5
        val que5 = Question(
                5,
                "How many friends do you have?",
                "A few different groups with a couple people in each",
                "About 5-10",
                "Just 2-3 close friends",
                "A huge group of wonderful friends",
                3,
                2,
                4,
                1
        )

        questionsList.add(que5)

        //6
        val que6 = Question(
                6,
                "Which of these music genres do you like the most?",
                "Soft rock",
                "Heavy metal",
                "Classical",
                "Latest hits",
                3,
                4,
                1,
                2
        )

        questionsList.add(que6)

        //7
        val que7 = Question(
                7,
                " Which magical charm would you like to have?",
                "Something that would make me completely free or extremely powerful",
                "Probably invincibility or immortality",
                "Something that would bring me more attention and love",
                "Wisdom or a unique skill of some sort",
                4,
                2,
                1,
                3
        )

        questionsList.add(que7)

        //8
        val que8 = Question(
                8,
                "If someone you love died, how would you handle it?",
                "I'd grieve and cry for a  long time",
                "It would be hard but I'd try to accept that they're gone",
                "I'd focus on all the good times together to make the pain go away",
                "I'd give it some time to sink in and let myself feel all the emotions that would come with it",
                2,
                4,
                3,
                1
        )

        questionsList.add(que8)

        //9
        val que9 = Question(
                9,
                "If you had 1 million dollars, what would you do with it?",
                "Donate it to a charity",
                "Save it",
                "Spend all of it",
                "Give half to family and spend the other half helping the homeless",
                2,
                4,
                1,
                3
        )

        questionsList.add(que9)

        //10
        val que10 = Question(
                10,
                "How would you describe your life?",
                "A big spotlight of attention!",
                "Full of fun and positive vibes",
                "Emotional",
                "A bit modest but full of love",
                1,
                2,
                3,
                4
        )

        questionsList.add(que10)

        return questionsList
    }
}
