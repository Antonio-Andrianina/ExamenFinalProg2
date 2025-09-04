import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import principal.Cours;
import principal.Enseignant;
import principal.Etudiant;
import principal.Examen;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    private Enseignant profPROG2;
    private Enseignant profWEB2;
    private Etudiant etudiant1;
    private Etudiant etudiant2;
    private Cours coursMath;
    private Cours coursInfo;
    private Examen examMath;
    private Examen examJava;
