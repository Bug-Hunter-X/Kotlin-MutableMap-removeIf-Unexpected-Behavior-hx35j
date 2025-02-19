# Kotlin MutableMap removeIf Unexpected Behavior

This repository demonstrates an unexpected behavior of the `removeIf` function when used with `MutableMap` in Kotlin.  While `removeIf` works as expected with `MutableList` and `MutableSet`, its behavior with `MutableMap` might be counterintuitive.

The issue is that `removeIf` on a map iterates through the map's entries (key-value pairs), and the predicate function (`it`) provides the entire entry as a `Map.Entry`.  Therefore, using conditions on keys requires accessing the key explicitly.

The example code showcases the correct way to use `removeIf` on maps and highlights the potential for errors when not explicitly handling map entries.

## Usage

1. Clone this repository.
2. Open `bug.kt` to see the unexpected behavior.
3. Open `bugSolution.kt` to see the correct usage of `removeIf` with `MutableMap`.

## Contributing

Contributions are welcome!