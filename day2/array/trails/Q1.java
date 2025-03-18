package day2.array.trails;

// You are tasked with finding the highest score in a series of test results represented as an array of integers. The highest score needs to be identified to award a special recognition.

// Problem: Write a Java program that takes an array of integers representing test scores and returns the highest score.
















public class Q1 {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 99, 88};
        int maxScore = findMaxScore(scores);
        System.out.println("The highest score is: " + maxScore);
    }

    public static int findMaxScore(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
}
