# Yahtzee made with Java

## Gameplay:

In each turn a player may throw the dice up to three times. A player doesn't have to roll all five dice on the second and third throw of a round, he may put as many dice as he wants to the side and only throw the ones that don't have the numbers he's trying to get. For example, a player throws and gets 1,3,3,4,6. He decides he want to try for the large straight, 1,2,3,4,5. So, he puts 1,3,4 to the side and only throws 3 and 6 again, hoping to get 2 and 5.

## Combinations:

        > Upper half

- **Ones:** Get as many ones as possible.
- **Twos:** Get as many twos as possible.
- **Threes:** Get as many threes as possible.
- **Fours:** Get as many fours as possible.
- **Fives:** Get as many fives as possible.
- **Sixes:** Get as many sixes as possible.

        > Bonus

- **Bonus:** If the sum of all the above combinations is calculated and if it is 63 or more, the player will get a bonus of 35 points.

        > Lower half

- **Three of a kind:** Get three dice with the same number. Points are the sum all dice (not just the three of a kind).
- **Four of a kind:** Get four dice with the same number. Points are the sum all dice (not just the four of a kind).
- **Full house:** Get three of a kind and a pair, e.g. 1,1,3,3,3 or 3,3,3,6,6. Scores 25 points.
- **Small straight:** Get four sequential dice, 1,2,3,4 or 2,3,4,5 or 3,4,5,6. Scores 30 points.
- **Large straight:** Get five sequential dice, 1,2,3,4,5 or 2,3,4,5,6. Scores 40 points.
- **Chance:** You can put anything into chance, it's basically like a garbage can when you don't have anything else you can use the dice for. The score is simply the sum of the dice.
- **YAHTZEE:** Five of a kind. Scores 50 points. You can optionally get multiple Yahtzees, see below for details.
