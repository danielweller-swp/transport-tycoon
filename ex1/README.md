## A mathematical approach to Exercise 1

**Note:** This is not a solution to exercise 1 since the
problem statement requires to move the containers in the exact
sequence given.

Looking a more lenient version of exercise 1, where we
may move the container in any order and seek to minimize
the total time it takes to move all containers to their
destination, we observe that "doing the As first, and 
then doing the Bs" ought to be optimal in most cases
(formal proof forthcoming ;-)).

The edge cases seem to be (where `numAs` and `numBs` denote
the number of `A`s and number of `B`s in the problem, respectively):

- In case `numAs % 2 == 0 && numBs % 2 == 1`, a truck waits at the factory
  for 5 ticks,
- in case `numAs % 2 == 1 && numBs % 2 == 0`, a truck waits at the factory
  for 7 ticks,
- in case `numAs % 2 == 1 && numBs % 2 == 1`, a truck waits at the factory
  for 8 ticks.

In case `numAs` is sufficiently large, these edge cases won't matter since
then the trucks need to wait for the ship anyways.

### Output

```
$ sbt run
A: 5
AB: 5
BB: 5
ABB: 7
AABABBAB: 29
```

