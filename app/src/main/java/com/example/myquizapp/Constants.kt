package com.example.myquizapp

object Constants {

    const val USER_NAME :String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

     // question1
        val ques1 = Question(
            1,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Austria", "Uruguay", "Colombia",
            1
        )
        questionsList.add(ques1)

        // question2
        val ques2 = Question(
            2,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "Canada",
            "Australia", "Uruguay", "Colombia",
            2
        )
        questionsList.add(ques2)

        // question3
        val ques3 = Question(
            3,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "Germany",
            "Austria", "Peru", "Belgium",
            4
        )
        questionsList.add(ques3)

        // question4
        val ques4 = Question(
            4,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_brazil,
            "Cambala",
            "Austria", "Brazil", "Venesuela",
            3
        )
        questionsList.add(ques4)

        // question5
        val ques5 = Question(
            5,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_fiji,
            "Bolivia",
            "Ecuadur", "Suriname", "Fiji",
            4
        )
        questionsList.add(ques5)

        // question6
        val ques6 = Question(
            6,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_denmark,
            "England",
            "Denmark", "Norway", "Swizzerland",
            2
        )
        questionsList.add(ques6)

        // question7
        val ques7 = Question(
            7,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_germany,
            "Finland",
            "Bulgaria", "Germany", "Belgium",
            3
        )
        questionsList.add(ques7)

        // question8
        val ques8 = Question(
            8,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_india,
            "Bhutan",
            "Indonesia", "Myanmar", "India",
            4
        )
        questionsList.add(ques8)

        // question9
        val ques9 = Question(
            9,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "UEA", "Jordan", "Sudan",
            1
        )
        questionsList.add(ques9)

        // question10
        val ques10 = Question(
            10,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_new_zealand,
            "Guyana",
            "Austria", "New-Zealand", "America",
            3
        )
        questionsList.add(ques10)

        // question11
        val ques11 = Question(
            11,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_maldives,
            "Maldives",
            "Slovakia", "Ethiopia", "Grenada",
            1
        )
        questionsList.add(ques11)

        // question12
        val ques12 = Question(
            12,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_algeria,
            "Marocco",
            "Uzbekistan", "Ethiopia", "Algeria",
            4
        )
        questionsList.add(ques12)

        // question13
        val ques13 = Question(
            13,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_uganda,
            "Zimbabwe",
            "Vanuatu", "Uganda", "Zambia",
            3
        )
        questionsList.add(ques13)

        // question14
        val ques14 = Question(
            14,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_andorra,
            "Tonga",
            "Andorra", "Malisia", "Grenada",
            2
        )
        questionsList.add(ques14)

        // question15
        val ques15 = Question(
            15,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_thailand,
            "Thailand",
            "Slovakia", "Scotland", "Rwanda",
            1
        )
        questionsList.add(ques15)

        // question16
        val ques16 = Question(
            16,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_albania,
            "Albania",
            "Portugal", "Sengapure", "Mali",
            1
        )
        questionsList.add(ques16)

        // question17
        val ques17 = Question(
            17,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_ukraine,
            "Russia",
            "Mexico", "Ukraine", "Oman",
            3
        )
        questionsList.add(ques17)

        // question18
        val ques18 = Question(
            18,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_afghanistan,
            "Pakistan",
            "Afghanistan", "Uzbekistan", "Grenada",
            2
        )
        questionsList.add(ques18)

        // question19
        val ques19 = Question(
            19,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_tanzania,
            "Oman",
            "Jordan", "Tanzania", "Qadar",
            3
        )
        questionsList.add(ques19)

        // question20
        val ques20 = Question(
            20,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_angola,
            "Mangolia",
            "Monaco", "Angola", "Peru",
            3
        )
        questionsList.add(ques20)

        // question21
        val ques21 = Question(
            21,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_wales,
            "Wales",
            "Scotland", "Guinea", "Niger",
            1
        )
        questionsList.add(ques21)

        // question22
        val ques22 = Question(
            22,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_antarctica,
            "Iceland",
            "Antarctica", "The sea", "Loas",
            2
        )
        questionsList.add(ques22)

        // question23
        val ques23 = Question(
            23,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_syria,
            "Oman",
            "Jordan", "Syria", "Qadar",
            3
        )
        questionsList.add(ques23)

        // question24
        val ques24 = Question(
            24,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_armenia,
            "Indonesia",
            "Tunisia", "Armenia", "Vietnam",
            3
        )
        questionsList.add(ques24)

        // question25
        val ques25 = Question(
            25,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_austria,
            "Poland",
            "Monaco", "Iran", "Austria",
            4
        )
        questionsList.add(ques25)

        // question26
        val ques26 = Question(
            26,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_congo,
            "Congo",
            "South Africa", "Sudan", "Kenya",
            1
        )
        questionsList.add(ques26)

        // question27
        val ques27 = Question(
            27,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_vietnam,
            "Indonesia",
            "Tunisia", "Iran", "Vietnam",
            4
        )
        questionsList.add(ques27)

        // question28
        val ques28 = Question(
            28,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_croatia,
            "Sweden",
            "Croatia", "Korea", "Iceland",
            2
        )
        questionsList.add(ques28)

        // question29
        val ques29 = Question(
            29,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_hongkong,
            "Hongkong",
            "China", "Jaban", "Tunis",
            1
        )
        questionsList.add(ques29)

        // question30
        val ques30 = Question(
            30,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_cuba,
            "Indonesia",
            "Tunisia", "Iran", "Cuba",
            4
        )
        questionsList.add(ques30)

        // question31
        val ques31 = Question(
            31,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_hungary,
            "Hungary",
            "Iraq", "Oman", "Egypt",
            1
        )
        questionsList.add(ques31)

        // question32
        val ques32 = Question(
            32,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_iceland,
            "Norway",
            "Scotland", "Iceland", "Vietnam",
            3
        )
        questionsList.add(ques32)

        // question33
        val ques33 = Question(
            33,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_indonesia,
            "Indonesia",
            "Monaco", "Iran", "Poland",
            1
        )
        questionsList.add(ques33)

        // question34
        val ques34 = Question(
            34,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_iran,
            "Pakistan",
            "India", "Iran", "Oman",
            3
        )
        questionsList.add(ques34)

        // question35
        val ques35 = Question(
            35,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_mali,
            "Mali",
            "Nigeria", "Namibia", "Mozambique",
            1
        )
        questionsList.add(ques35)

        // question36
        val ques36 = Question(
            36,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_mexico,
            "Panama",
            "Mexico", "Serbia", "Samoa",
            2
        )
        questionsList.add(ques36)

        // question37
        val ques37 = Question(
            37,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_romania,
            "Mongolia",
            "Lebanon", "Iran", "Romania",
            4
        )
        questionsList.add(ques37)

        // question38
        val ques38 = Question(
            38,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_rwanda,
            "Rwanda",
            "Ethopia", "Grenada", "Vietnam",
            1
        )
        questionsList.add(ques38)

        // question39
        val ques39 = Question(
            39,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_sweden,
            "Tuvalu",
            "Sweden", "Nauru", "Malasia",
            2
        )
        questionsList.add(ques39)

        // question40
        val ques40 = Question(
            40,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_monaco,
            "Poland",
            "France", "Monaco", "Oman",
            3
        )
        questionsList.add(ques40)






      return questionsList
    }
}