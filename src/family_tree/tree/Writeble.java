package family_tree.tree;

import java.io.Serializable;

public interface Writeble {
    boolean save(Serializable object, String filepath);

    Object read(String filepath);
}