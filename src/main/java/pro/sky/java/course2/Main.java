package pro.sky.java.course2;


/*Класс StringUtils из библиотеки commons-lang3.
Облегчает работу со строками, а также имеет массу проверок.
 Например, позволяет отрезать фрагмент строки после или до первого
 символа/последовательности символов. Или проверить, что строка
 полностью состоит из чисел/букв/пробелов.*/

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String lettersAndSpaceStr = "ivanov ivan Иванович";
        String emptyStr = " ";
        System.out.println(StringUtils.capitalize(lettersAndSpaceStr));//капитализироавть -Ivanov ivan
        System.out.println(StringUtils.deleteWhitespace(lettersAndSpaceStr));// удалить пробеллы - ivanovivan
        System.out.println(StringUtils.substringAfterLast(lettersAndSpaceStr, " "));//подстрока После последнего - ivan
        System.out.println(StringUtils.isAllUpperCase(lettersAndSpaceStr));//все в верхнем регистре - false (непойму почему false когда сам )
        System.out.println(StringUtils.isAlphanumericSpace(lettersAndSpaceStr));//это буквенно-цифровой пробел - true
        System.out.println(StringUtils.isWhitespace(emptyStr));//это пробелы - true

        //Позволяет находить минимум и максимум среди любого количества переменных, а также удобно конвертировать
        // строку в любой из числовых типов.
        int a = 5;
        int b = 100500;
        int c = Integer.MAX_VALUE;
        System.out.println(NumberUtils.min(a, b, c));
        System.out.println(NumberUtils.max(a, b, c));
        String floatedPointString = "1.0f";
        float f = NumberUtils.toFloat(floatedPointString);
        System.out.println(f);


//            Классы пакета com.google.common.collect из guava предлагают нам альтернативный способ создания коллекций
//            благодаря классам-конструкторам Lists, Sets и Maps.

        List<Integer> numbers = Lists.newArrayList(1, 2, 3);
        List<Integer> numbers2 = Lists.newLinkedList(numbers);
        Set<Integer> numbersSet = Sets.newHashSet(5, 4, 3, 1, 1, 3, 4, 5);
        System.out.println(numbers);
        System.out.println(numbers2);
        System.out.println(numbersSet);
        //ак видите, в данном примере используются статические методы, а не создание через new.
        //Эти статические методы позволяют инициализировать коллекцию напрямую передачей в скобки
        // значений, а не через обертку List.of или Arrays.asList.
        //Если приводить другие примеры, то в голову сразу приходит библиотека Jackson, которая помогает Spring
        // творить магию, превращая ваши объекты в JSON.

    }
}