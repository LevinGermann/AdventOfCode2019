package com.levingermann.aoc2019.day01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    private final List<Integer> masses = Arrays.asList(148216,
            142030,
            129401,
            74642,
            108051,
            54128,
            145495,
            67818,
            120225,
            67113,
            107672,
            101032,
            147714,
            55788,
            87732,
            73681,
            114646,
            76586,
            116436,
            139788,
            125150,
            136675,
            90527,
            74674,
            105505,
            146059,
            52735,
            101389,
            108121,
            62897,
            132337,
            51963,
            129188,
            122308,
            84677,
            66433,
            118374,
            66822,
            94714,
            101162,
            54030,
            136580,
            55677,
            114051,
            133898,
            95026,
            112964,
            68662,
            85139,
            53559,
            84703,
            92053,
            132197,
            60130,
            63184,
            86182,
            113038,
            52659,
            140463,
            123234,
            97887,
            70216,
            131832,
            108162,
            116759,
            111828,
            132815,
            113476,
            127734,
            134545,
            99643,
            141911,
            74705,
            65720,
            95640,
            51581,
            66787,
            147590,
            72937,
            148774,
            119881,
            139875,
            131976,
            68238,
            100342,
            134691,
            112320,
            86107,
            100045,
            120458,
            54459,
            52047,
            108226,
            102138,
            141233,
            54452,
            67859,
            105132,
            81903,
            104282);

    public Main() {
        int sum = 0;
        for(Integer mass : masses){
            sum += calculateFuel(mass);
        }
        System.out.println(sum);
    }

    private int calculateFuel(int mass) {
        return (mass / 3) - 2;
    }

    public static void main(String[] args) {
        new Main();
    }
}