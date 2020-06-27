package ru.job4j;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Test {
    public static void main(String[] args) {
//        List<List<Integer>> rsl = List.of(
//                List.of(1, 2),
//                List.of(3, 4)
//        );
//        Stream<Integer> stream;
//        rsl.stream()
//                .flatMap(e -> e.stream())
//                .forEach(System.out::println);
//        List<Integer> list = rsl.stream()
//                .flatMap(e -> e.stream())
//                .collect(Collectors.toList());


        Iterator<Iterator<Integer>> data = List.of(
                List.of(1).iterator(),
                List.of(2, 3).iterator()
        ).iterator();

//        Iterable<Iterator<Integer>> iterable = new Iterable() {
//            @Override
//            public Iterator iterator() {
//                return data;
//            }
//        };
        Iterable<Iterator<Integer>> iterable = () -> data;
        Stream<Iterator<Integer>> x = StreamSupport.stream(iterable.spliterator(), false);
        //x.forEach(a -> System.out.println(a.hasNext()));
        //Iterable<Iterator<Integer>> iterable = () -> a
        //x.forEach(a -> StreamSupport.stream((Iterable) () -> a).);
        //Stream<Integer> y = x.flatMap(a -> a.next());
        //x.forEach(a -> System.out.println(a.next()));
        x.forEach(a -> StreamSupport.stream(((Iterable) () -> a).spliterator(), false).forEach(System.out::println));
        //x.collect(Collectors.toList());
        //StreamSupport.stream(((Iterable) () -> x).spliterator(), false);
        //x.flatMap(a -> StreamSupport.stream(() -> a), false).spliterator();
        //x.forEach(System.out::println);

        //System.out.println("end");

        //Stream<Iterator<Integer>> y = StreamSupport.stream(Spliterators.spliterator(data), false);
        //Stream<Integer> y = StreamSupport.stream((() -> x).spliterator(), false);
        //Stream<Iterator<Integer>> streamm = StreamSupport.stream(((Iterable) () -> x).spliterator(), false);
        //System.out.println(streamm.collect(Collectors.toList()));
        //System.out.println(x.flatMap(e -> e.));


        //List<Integer> list = streamm.collect(Collectors.toList());
        //streamm.forEach(s -> System.out.println(s));


//        Collection<Iterator<Integer>> copyList = new ArrayList<Iterator<Integer>>();
//        data.forEachRemaining(copyList::add);
//        System.out.println(copyList.stream());
        //Stream<Integer> intStream = StreamSupport
        //        .stream(((Iterable) () -> (Iterator) targetStream)
        //        .spliterator(), false);

        //        Iterator<Iterator<Integer>> stream = (Iterator<Iterator<Integer>>) StreamSupport
//                .stream((((Iterable) () -> data)
//                        .spliterator()), false);


        //System.out.println(data.stream.flatMap(e -> e.hasNext()).collec(Collectors.toList()));

//        Iterator<Integer> iterator = List.of(1, 2, 3).iterator();
//        Stream<Integer> streamm = StreamSupport.stream(((Iterable) () -> iterator).spliterator(), false);
//        streamm.forEach(s -> System.out.println(s));


    }

    //data.Stream.flatmap(e -> e.stream).collection(Collectors.toList()).System.of::println;

}
