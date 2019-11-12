## A mathematical solution to Exercise 1

This solution to the exercise is based on the observation
that "doing the As first, and then doing the Bs" ought to
be optimal in most cases (formal proof forthcoming ;-)).

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

### Bonus points

> What is the possible reason for the different solutions to return different answers?

Which container is picked up at the factory is non-deterministic. This can lead
to differences in time taken for the same set of containers.

Consider
- `ABB`: this takes 7.
- `BBA`: this takes 15.
