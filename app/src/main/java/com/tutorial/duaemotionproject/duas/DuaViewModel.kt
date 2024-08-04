package com.tutorial.duaemotionproject.duas

import androidx.lifecycle.ViewModel

class DuaViewModel : ViewModel() {
    val dua: Any
        get() {
            TODO()
        }

    private val duaMap = mapOf(
        "Happy" to Dua(
            arabic = "اللهم اجعلني من السعداء في الدنيا والآخرة",
            english = "O Allah, make me among the happy ones in this world and the Hereafter.",
            transliteration = "Allahumma ajilni min as-sa'adaa fi ad-dunya wal-akhirah"
        ),
        "Angry" to Dua(
            arabic = "رَبَّنَا أَذْهِبْ عَنَّا عَذَابَ الْجَحِيمِ",
            english = "Our Lord, remove from us the punishment of Hellfire",
            transliteration = "Rabbana azhib 'anna 'adhaba al-jaheem"
        ),
        "Calm" to Dua(
            arabic = "رَبِّ اشْرَحْ لِي صَدْرِي وَيَسِّرْ لِي أَمْرِي",
            english = "My Lord, expand for me my chest and ease for me my task.",
            transliteration = "Rabbi ishrah li sadri wa yassir li amri"
        ),
        "Excited" to Dua(
            arabic = "اللهم اجعلنا من المتفائلين",
            english = "O Allah, make us among the optimistic.",
            transliteration = "Allahumma ajilna min al-mutafa'ileen"
        ),
        "Sad" to Dua(
            arabic = "رَبِّ إِنَّكَ سَمِيعُ الدُّعَاءِ",
            english = "My Lord, indeed You are the Hearer of supplication.",
            transliteration = "Rabbi innaka samee'ud du'a"
        ),
        "Fearful" to Dua(
            arabic = "اللهم إني أعوذ بك من الهم والحزن",
            english = "O Allah, I seek refuge in You from worry and sorrow.",
            transliteration = "Allahumma inni a'oodhu bika min al-hammi wal-huzn"
        ),
        "Grateful" to Dua(
            arabic = "اللهم اجعلني من الشاكرين",
            english = "O Allah, make me among the grateful.",
            transliteration = "Allahumma ajilni min ash-shaakireen"
        ),
        "Confident" to Dua(
            arabic = "اللهم ثبتني على الحق",
            english = "O Allah, keep me steadfast on the truth.",
            transliteration = "Allahumma thabbitni 'ala al-haqq"
        ),
        "Tired" to Dua(
            arabic = "اللهم اجعلني صابراً",
            english = "O Allah, make me patient.",
            transliteration = "Allahumma ajilni sabiran"
        ),
        "Stressed" to Dua(
            arabic = "اللهم هون علينا ما نحن فيه",
            english = "O Allah, ease for us what we are experiencing.",
            transliteration = "Allahumma hawn 'alayna ma nahnu fee"
        ),
        "Lonely" to Dua(
            arabic = "اللهم أنس وحدتي",
            english = "O Allah, bring comfort to my loneliness.",
            transliteration = "Allahumma ans wahdati"
        ),
        "Hopeful" to Dua(
            arabic = "اللهم ارزقني الأمل",
            english = "O Allah, grant me hope.",
            transliteration = "Allahumma ruzuqni al-amal"
        ),
        "Overwhelmed" to Dua(
            arabic = "اللهم اكشف همي وكربتي",
            english = "O Allah, remove my anxiety and distress.",
            transliteration = "Allahumma kshif hammi wa karbati"
        ),
        "Bored" to Dua(
            arabic = "اللهم اجعل وقتي مفيدا",
            english = "O Allah, make my time beneficial.",
            transliteration = "Allahumma ajil waqt i mufeed"
        )
    )



    fun getDua(emotionName: String): Dua {
        return duaMap[emotionName] ?: Dua(
            arabic = "No dua available",
            english = "No dua available",
            transliteration = "No dua available"
        )
    }
}
