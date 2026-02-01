 data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
enum class Difficulty
{
    EASY,
    MEDIUM,
    HARD
}
 object StudentProgress {
     var total: Int = 10
     var answered: Int = 3
 }
 interface ProgressPrintable {
     val progressText: String
     fun printProgressBar()
 }
 class Quiz: ProgressPrintable {
     override val progressText: String
     get() = "${answered} of ${total} answered"
     override fun printProgressBar() {
         repeat(times = Quiz.answered) { print("") }
         repeat(times = Quiz.total -Quiz.answered) { print(" ") }
         println()
         println(progressText)
     }

     val question1 = Question<String>(

     questionText = "Речка спятила с ума По домам пошла сама...",
     answer = "водопровод",
     Difficulty.MEDIUM
     )
     val question2 = Question<Boolean>(
         questionText = "Небо зелёное. Правда или ложь",
         answer= false,
         Difficulty.EASY
     )
     val question3 = Question<Int>(
         questionText = "Сколько дней между полнолуниями?",
         answer = 28,
         Difficulty.HARD
     )
     companion object StudentProgress {
         var total: Int = 10
         var answered: Int = 3
     }
     fun printQuiz() {
         question1.let {
             println(it.questionText)
             println(it.answer)
             println(it.difficulty)
         }
         println()
         question2.let {
             println(it.questionText)
             println(it.answer)
             println(it.difficulty)
         }
         println()
         question3.let {
             println(it.questionText)
             println(it.answer)
             println(it.difficulty)
         }
         println()
     }

 }

fun main() {
    val question1 = Question<String>(
        questionText = "Речка спятила с ума По домам пошла сама.___",
        "водопровод",
        Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        questionText = "Небо зелёное. Правда или ложь",
        answer = false,
        Difficulty.EASY
    )
    val question3 = Question<Int>(
        questionText = "Сколько дней между полнолуниями?",
        answer = 28,
        Difficulty.HARD
    )
    val quiz = Quiz()
    quiz.printQuiz()
    Quiz().apply { printQuiz() }
    Quiz().printProgressBar()
}