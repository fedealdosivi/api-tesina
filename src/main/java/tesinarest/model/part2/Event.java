package tesinarest.model.part2;

import tesinarest.model.Account;
import tesinarest.model.Location;

import java.util.List;

public class Event {
    List<Account> organizers;
    List<Account> participants;
    String Place;
    List<Post> posts;
    Location startPoint;
    Location endPoint;
}