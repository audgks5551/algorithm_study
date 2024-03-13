package org.example.lessons;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Solution42840 {
    public int[] solution(int[] answers) {

        List<MathPhobic> mathPhobics = List.of(
                new MathPhobic(1, List.of(1, 2, 3, 4, 5)),
                new MathPhobic(2, List.of(2, 1, 2, 3, 2, 4, 2, 5)),
                new MathPhobic(3, List.of(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))
        );

        for (int answer : answers) {
            mathPhobics.forEach(mathPhobic -> mathPhobic.checkingAnswer(answer));
        }

        int max = mathPhobics.stream()
                .mapToInt(MathPhobic::getCorrectCount)
                .max()
                .getAsInt();

        return mathPhobics.stream()
                .filter(mathPhobic -> mathPhobic.getCorrectCount() == max)
                .mapToInt(MathPhobic::getId)
                .toArray();
    }

    class MathPhobic {
        private final int id;
        private final Deque<Integer> numbers = new ArrayDeque<>();
        private int correctCount;

        public MathPhobic(int id, List<Integer> numbers) {
            this.id = id;
            numbers.forEach(this.numbers::offer);
            this.correctCount = 0;
        }

        public void checkingAnswer(int answer) {
            Integer num = this.numbers.poll();

            if (answer == num) {
                correctCount++;
            }

            this.numbers.offer(num);
        }

        public int getCorrectCount() {
            return this.correctCount;
        }

        public int getId() {
            return this.id;
        }

        @Override
        public String toString() {
            return "MathPhobic{id=%d, correctCount=%d}".formatted(id, correctCount);
        }
    }
}
