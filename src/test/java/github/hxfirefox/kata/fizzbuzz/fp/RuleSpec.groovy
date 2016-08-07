package github.hxfirefox.kata.fizzbuzz.fp

import spock.lang.Specification

import static github.hxfirefox.kata.fizzbuzz.fp.Action.nop
import static github.hxfirefox.kata.fizzbuzz.fp.Action.to
import static github.hxfirefox.kata.fizzbuzz.fp.Matcher.always
import static github.hxfirefox.kata.fizzbuzz.fp.Matcher.times
import static github.hxfirefox.kata.fizzbuzz.fp.Rules.allOf
import static github.hxfirefox.kata.fizzbuzz.fp.Rules.anyOf
import static github.hxfirefox.kata.fizzbuzz.fp.Rules.atom

class RuleSpec extends Specification {
    private static def spec() {
        Rule r1_3 = atom(times(3), to("Fizz"))
        Rule r1_5 = atom(times(5), to("Buzz"))

        Rule r1 = anyOf(r1_3, r1_5)
        Rule r2 = anyOf(allOf(r1_3, r1_5))
        Rule rd = atom(always(true), nop())

        anyOf(r2, r1, rd)
    }

    def "Fizz Buzz"() {
        expect:
        spec().apply(n) == expect

        where:
        n  | expect
        1  | "1"
        3  | "Fizz"
        5  | "Buzz"
        9  | "Fizz"
        15 | "FizzBuzz"
        25 | "Buzz"
    }
}
