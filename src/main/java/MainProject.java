import Engine.*;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL30.*;
public class MainProject {
    private Window window =
            new Window(800, 800, "Project");

    public void run() {
        init();
        loop();
        // Terminate GLFW and free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    Projection projection = new Projection(window.getWidth(), window.getHeight());
    Camera camera = new Camera();
    ArrayList<Sphere2> pY = new ArrayList<>(); //YOEL
    ArrayList<Sphere2> pH = new ArrayList<>(); //HADI
    ArrayList<Object2d> pZ = new ArrayList<>(); //ENVIRONMENT
    ArrayList<Object2d> pX = new ArrayList<>();

    public void init() {
        window.init();
        GL.createCapabilities();
        // code dst jangan ditaruh diatas code diatas
        camera.setPosition(0, 0.0f, 2f);
        camera.setRotation((float) Math.toRadians(0.0f), (float) Math.toRadians(3.0f));


        //ISI CODINGAN

        pZ.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.517f, 0.478f, 0.494f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.5f, 1.5f, 0.5f,
                30, 15, 1
        ));
        pZ.get(0).translateObject(0.9f, 0.5f, -2f);

        pZ.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.517f, 0.478f, 0.494f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.5f, 1.5f, 0.5f,
                30, 15, 1
        ));
        pZ.get(1).translateObject(-0.9f, 0.5f, -2f);

        pZ.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 1.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.5f, 1.2f, 0.5f,
                30, 15, 1
        ));
        pZ.get(2).translateObject(0.9f, 0.5f, -4f);

        pZ.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.517f, 0.478f, 0.494f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.5f, 2f, 0.5f,
                30, 15, 1
        ));
        pZ.get(3).translateObject(-0.9f, 0.8f, -4f);
        //YOEL
        //BADAN
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.15f, 0.25f, 0.15f,
//                30, 15, 1
//        ));
//        pY.get(0).translateObject(0.0f, 0.18f, 0.0f);
//
//        //WAJAH
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.2f, 0.2f, 0.2f,
//                30, 15, 8
//        ));
//        pY.get(1).translateObject(0.0f, 0.5f, 0.0f);
//
//        //MATA1
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.03f, 0.03f, 0.03f,
//                30, 15, 8
//        ));
//        pY.get(2).translateObject(-0.08f, 0.5f, 0.18f);
//
//        //MATA2
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.03f, 0.03f, 0.03f,
//                30, 15, 8
//        ));
//        pY.get(3).translateObject(0.08f, 0.5f, 0.18f);
//
//        //BAHU1
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.08f, 0.08f, 0.08f,
//                30, 15, 9
//        ));
//        pY.get(4).translateObject(0.08f, 0.24f, 0.0f);
//
//        //BAHU2
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.08f, 0.08f, 0.08f,
//                30, 15, 9
//        ));
//        pY.get(5).translateObject(-0.08f, 0.24f, 0.0f);
//
//        //BAWAH
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f, 0.0f, 1.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.15f, 0.05f, 0.15f,
//                30, 15, 1
//        ));
//        pY.get(6).translateObject(0.0f, 0.03f, 0.0f);
//
//        //KAKI1
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 0.0f, 1.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.075f, 0.15f, 0.1f,
//                30, 15, 1
//        ));
//        pY.get(7).translateObject(-0.035f, -0.07f, 0.0f);
//
//        //KAKI2
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 1.0f, 0.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.075f, 0.15f, 0.1f,
//                30, 15, 1
//        ));
//        pY.get(8).translateObject(0.039f, -0.07f, 0.0f);
//
//        //KAKIBAWAH1
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f, 1.0f, 1.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.0375f, 0.0375f, 0.0375f,
//                30, 15, 10
//        ));
//        pY.get(9).translateObject(-0.034f, -0.14f, 0.0f);
//
//        //KAKIBAWAH2
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.0f, 1.0f, 1.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.0375f, 0.0375f, 0.0375f,
//                30, 15, 10
//        ));
//        pY.get(10).translateObject(0.036f, -0.14f, 0.0f);
//
//        //TANGAN1
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 0.0f, 1.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.05f, 0.2f, 0.1f,
//                30, 15, 1
//        ));
//        pY.get(11).translateObject(-0.105f, 0.13f, 0.0f);
//
//        //TANGAN2
//        pY.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(1.0f, 1.0f, 0.0f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.05f, 0.2f, 0.1f,
//                30, 15, 1
//        ));
//        pY.get(12).translateObject(0.105f, 0.13f, 0.0f);


//
//        pZ.add(new Sphere2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                new ArrayList<>(),
//                new Vector4f(0.517f, 0.478f, 0.494f, 1.0f),
//                0.5,
//                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
//                0.5f, 1.5f, 0.5f,
//                30, 15, 1
//        ));
//        pZ.get(0).translateObject(0.9f, 0.5f, -2f);

//        pZ.get(0).getChildObject().add(new Circle2(
//                Arrays.asList(
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.vert", GL_VERTEX_SHADER),
//                        new ShaderProgram.ShaderModuleData(
//                                "resources/scene.frag", GL_FRAGMENT_SHADER)
//                ),
//                        new ArrayList<>(),
//                        new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
//                        new ArrayList<>(List.of()),
//                        1.0f, 1.0f, 2));
//        pZ.get(0).getChildObject().get(0).translateObject(0.8f, 0.5f, -2f);




        //HADI
        //KEPALA
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.45f, 0.29f, 0.14f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.145f, 0.15f, 0.15f,
                30, 15, 9
        ));
        pH.get(0).translateObject(0.0f, 0.14f, 0.0f);

        //BADAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.45f, 0.29f, 0.1f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.27f, 0.27f, 0.27f,
                30, 15, 1
        ));
        pH.get(1).translateObject(0.0f, 0.0f, 0.0f);

        //MATA1 (KIRI DARI POSISI USER)
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.015f, 0.035f, 0.03f,
                30, 15, 8
        ));
        pH.get(2).translateObject(-0.05f, 0.15f, 0.14f);

        //MATA2 (KANAN DARI POSISI USER)
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.0f, 0.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.015f, 0.035f, 0.03f,
                30, 15, 8
        ));
        pH.get(3).translateObject(0.05f, 0.15f, 0.14f);

        //SHADING MATA1
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.009f, 0.009f, 0.03f,
                30, 15, 8
        ));
        pH.get(4).translateObject(-0.05f, 0.165f, 0.15f);

        //SHADING MATA2
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 1.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.009f, 0.009f, 0.03f,
                30, 15, 8
        ));
        pH.get(5).translateObject(0.05f, 0.165f, 0.15f);

        //HIDUNG
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.94f, 0.42f, 0.30f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.055f, 0.03f, 0.03f,
                30, 15, 8
        ));
        pH.get(6).translateObject(0.0045f, 0.07f, 0.14f);

        //BATU1 TENGAH
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(7).translateObject(0.0f, -0.13f, 0.15f);

        //BATU2 KANAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(8).translateObject(0.06f, -0.13f, 0.14f);

        //BATU3 KANAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(9).translateObject(0.1f, -0.13f, 0.1f);

        //BATU4 KANAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(10).translateObject(0.13f, -0.13f, 0.11f);

        //BATU5 KIRI
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(11).translateObject(-0.06f, -0.13f, 0.14f);

        //BATU6 KIRI
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(12).translateObject(-0.1f, -0.13f, 0.1f);

        //BATU7 KIRI
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(13).translateObject(-0.13f, -0.13f, 0.11f);

        //BATU8 KIRI
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(14).translateObject(-0.15f, -0.13f, 0.07f);

        //BATU9 KIRI
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(15).translateObject(-0.16f, -0.13f, 0.03f);

        //BATU10 KIRI
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(16).translateObject(-0.18f, -0.13f, -0.01f);

        //BATU11 KIRI
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(17).translateObject(-0.19f, -0.13f, -0.06f);

        //BATU12 KIRI
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(18).translateObject(-0.18f, -0.13f, -0.1f);

        //BATU13 KIRI
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(19).translateObject(-0.16f, -0.13f, -0.12f);

        //BATU14 KANAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(20).translateObject(0.15f, -0.13f, 0.07f);

        //BATU15 KANAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(21).translateObject(0.17f, -0.13f, 0.03f);

        //BATU16 KANAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(22).translateObject(0.19f, -0.13f, -0.01f);

        //BATU17 KANAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(23).translateObject(0.17f, -0.13f, -0.06f);

        //BATU18 KANAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(24).translateObject(0.15f, -0.13f, -0.1f);

        //BATU19 KANAN
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(25).translateObject(0.116f, -0.13f, -0.12f);

        //BATU20 BELAKANG
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(26).translateObject(0.15f, -0.13f, -0.15f);

        //BATU21 BELAKANG
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(27).translateObject(0.11f, -0.13f, -0.16f);

        //BATU22 BELAKANG
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(28).translateObject(0.07f, -0.13f, -0.17f);

        //BATU23 BELAKANG
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(29).translateObject(0.03f, -0.13f, -0.18f);

        //BATU24 BELAKANG
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(30).translateObject(-0.01f, -0.13f, -0.18f);

        //BATU25 BELAKANG
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(31).translateObject(-0.06f, -0.13f, -0.18f);

        //BATU26 BELAKANG
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(32).translateObject(-0.11f, -0.13f, -0.17f);

        //BATU27 BELAKANG
        pH.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.8f, 0.8f, 0.8f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.05f, 0.05f, 0.05f,
                30, 15, 8
        ));
        pH.get(33).translateObject(-0.15f, -0.13f, -0.16f);

    }

    public void input() {
        List<ShaderProgram.ShaderModuleData> shader = Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData(
                        "resources/scene.frag", GL_FRAGMENT_SHADER)
        );


        //ISI COMMENT MAU APA AJA
        if(window.isKeyPressed(GLFW_KEY_F)){
            Vector3f head = pH.get(0).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
            pH.get(1).translateObject(-head.x, -head.y, 0.0f);
            pH.get(2).translateObject(-head.x, -head.y, 0.0f);
            pH.get(3).translateObject(-head.x, -head.y, 0.0f);
            pH.get(4).translateObject(-head.x, -head.y, 0.0f);
            pH.get(5).translateObject(-head.x, -head.y, 0.0f);
            pH.get(6).translateObject(-head.x, -head.y, 0.0f);
            pH.get(7).translateObject(-head.x, -head.y, 0.0f);
            pH.get(8).translateObject(-head.x, -head.y, 0.0f);
            pH.get(9).translateObject(-head.x, -head.y, 0.0f);
            pH.get(10).translateObject(-head.x, -head.y, 0.0f);
            pH.get(11).translateObject(-head.x, -head.y, 0.0f);
            pH.get(12).translateObject(-head.x, -head.y, 0.0f);
            pH.get(13).translateObject(-head.x, -head.y, 0.0f);
            pH.get(14).translateObject(-head.x, -head.y, 0.0f);
            pH.get(15).translateObject(-head.x, -head.y, 0.0f);
            pH.get(16).translateObject(-head.x, -head.y, 0.0f);
            pH.get(17).translateObject(-head.x, -head.y, 0.0f);
            pH.get(18).translateObject(-head.x, -head.y, 0.0f);
            pH.get(19).translateObject(-head.x, -head.y, 0.0f);
            pH.get(20).translateObject(-head.x, -head.y, 0.0f);
            pH.get(21).translateObject(-head.x, -head.y, 0.0f);
            pH.get(22).translateObject(-head.x, -head.y, 0.0f);
            pH.get(23).translateObject(-head.x, -head.y, 0.0f);
            pH.get(24).translateObject(-head.x, -head.y, 0.0f);
            pH.get(25).translateObject(-head.x, -head.y, 0.0f);
            pH.get(26).translateObject(-head.x, -head.y, 0.0f);
            pH.get(27).translateObject(-head.x, -head.y, 0.0f);
            pH.get(28).translateObject(-head.x, -head.y, 0.0f);
            pH.get(29).translateObject(-head.x, -head.y, 0.0f);
            pH.get(30).translateObject(-head.x, -head.y, 0.0f);
            pH.get(31).translateObject(-head.x, -head.y, 0.0f);
            pH.get(32).translateObject(-head.x, -head.y, 0.0f);
            pH.get(33).translateObject(-head.x, -head.y, 0.0f);
            pH.get(1).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(2).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(3).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(4).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(5).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(6).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(7).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(8).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(9).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(10).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(11).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(12).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(13).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(14).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(15).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(16).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(17).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(18).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(19).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(20).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(21).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(22).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(23).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(24).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(25).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(26).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(27).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(28).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(29).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(30).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(31).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(32).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(33).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
            pH.get(1).translateObject(head.x, head.y, 0.0f);
            pH.get(2).translateObject(head.x, head.y, 0.0f);
            pH.get(3).translateObject(head.x, head.y, 0.0f);
            pH.get(4).translateObject(head.x, head.y, 0.0f);
            pH.get(5).translateObject(head.x, head.y, 0.0f);
            pH.get(6).translateObject(head.x, head.y, 0.0f);
            pH.get(7).translateObject(head.x, head.y, 0.0f);
            pH.get(8).translateObject(head.x, head.y, 0.0f);
            pH.get(9).translateObject(head.x, head.y, 0.0f);
            pH.get(10).translateObject(head.x, head.y, 0.0f);
            pH.get(11).translateObject(head.x, head.y, 0.0f);
            pH.get(12).translateObject(head.x, head.y, 0.0f);
            pH.get(13).translateObject(head.x, head.y, 0.0f);
            pH.get(14).translateObject(head.x, head.y, 0.0f);
            pH.get(15).translateObject(head.x, head.y, 0.0f);
            pH.get(16).translateObject(head.x, head.y, 0.0f);
            pH.get(17).translateObject(head.x, head.y, 0.0f);
            pH.get(18).translateObject(head.x, head.y, 0.0f);
            pH.get(19).translateObject(head.x, head.y, 0.0f);
            pH.get(20).translateObject(head.x, head.y, 0.0f);
            pH.get(21).translateObject(head.x, head.y, 0.0f);
            pH.get(22).translateObject(head.x, head.y, 0.0f);
            pH.get(23).translateObject(head.x, head.y, 0.0f);
            pH.get(24).translateObject(head.x, head.y, 0.0f);
            pH.get(25).translateObject(head.x, head.y, 0.0f);
            pH.get(26).translateObject(head.x, head.y, 0.0f);
            pH.get(27).translateObject(head.x, head.y, 0.0f);
            pH.get(28).translateObject(head.x, head.y, 0.0f);
            pH.get(29).translateObject(head.x, head.y, 0.0f);
            pH.get(30).translateObject(head.x, head.y, 0.0f);
            pH.get(31).translateObject(head.x, head.y, 0.0f);
            pH.get(32).translateObject(head.x, head.y, 0.0f);
            pH.get(33).translateObject(head.x, head.y, 0.0f);
//            pY.get(1).rotateObject((float) Math.toRadians(0.5f),1f,0.0f,0.0f);
//            Vector3f head = pY.get(1).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            pY.get(2).translateObject(-head.x, -head.y, 0.0f);
//            pY.get(3).translateObject(-head.x, -head.y, 0.0f);
//            pY.get(2).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(3).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(2).translateObject(head.x, head.y, 0.0f);
//            pY.get(3).translateObject(head.x, head.y, 0.0f);
//            camera.moveForward(0.001f);
        }

        if(window.isKeyPressed(GLFW_KEY_R)){
            Vector3f head = pH.get(0).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
            pH.get(1).translateObject(-head.x, -head.y, 0.0f);
            pH.get(2).translateObject(-head.x, -head.y, 0.0f);
            pH.get(3).translateObject(-head.x, -head.y, 0.0f);
            pH.get(4).translateObject(-head.x, -head.y, 0.0f);
            pH.get(5).translateObject(-head.x, -head.y, 0.0f);
            pH.get(6).translateObject(-head.x, -head.y, 0.0f);
            pH.get(7).translateObject(-head.x, -head.y, 0.0f);
            pH.get(8).translateObject(-head.x, -head.y, 0.0f);
            pH.get(9).translateObject(-head.x, -head.y, 0.0f);
            pH.get(10).translateObject(-head.x, -head.y, 0.0f);
            pH.get(11).translateObject(-head.x, -head.y, 0.0f);
            pH.get(12).translateObject(-head.x, -head.y, 0.0f);
            pH.get(13).translateObject(-head.x, -head.y, 0.0f);
            pH.get(14).translateObject(-head.x, -head.y, 0.0f);
            pH.get(15).translateObject(-head.x, -head.y, 0.0f);
            pH.get(16).translateObject(-head.x, -head.y, 0.0f);
            pH.get(17).translateObject(-head.x, -head.y, 0.0f);
            pH.get(18).translateObject(-head.x, -head.y, 0.0f);
            pH.get(19).translateObject(-head.x, -head.y, 0.0f);
            pH.get(20).translateObject(-head.x, -head.y, 0.0f);
            pH.get(21).translateObject(-head.x, -head.y, 0.0f);
            pH.get(22).translateObject(-head.x, -head.y, 0.0f);
            pH.get(23).translateObject(-head.x, -head.y, 0.0f);
            pH.get(24).translateObject(-head.x, -head.y, 0.0f);
            pH.get(25).translateObject(-head.x, -head.y, 0.0f);
            pH.get(26).translateObject(-head.x, -head.y, 0.0f);
            pH.get(27).translateObject(-head.x, -head.y, 0.0f);
            pH.get(28).translateObject(-head.x, -head.y, 0.0f);
            pH.get(29).translateObject(-head.x, -head.y, 0.0f);
            pH.get(30).translateObject(-head.x, -head.y, 0.0f);
            pH.get(31).translateObject(-head.x, -head.y, 0.0f);
            pH.get(32).translateObject(-head.x, -head.y, 0.0f);
            pH.get(33).translateObject(-head.x, -head.y, 0.0f);
            pH.get(1).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(2).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(3).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(4).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(5).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(6).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(7).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(8).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(9).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(10).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(11).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(12).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(13).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(14).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(15).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(16).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(17).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(18).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(19).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(20).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(21).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(22).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(23).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(24).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(25).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(26).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(27).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(28).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(29).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(30).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(31).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(32).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(33).rotateObject((float) Math.toRadians(0.5f), 0.0f, -1f, 0.0f);
            pH.get(1).translateObject(head.x, head.y, 0.0f);
            pH.get(2).translateObject(head.x, head.y, 0.0f);
            pH.get(3).translateObject(head.x, head.y, 0.0f);
            pH.get(4).translateObject(head.x, head.y, 0.0f);
            pH.get(5).translateObject(head.x, head.y, 0.0f);
            pH.get(6).translateObject(head.x, head.y, 0.0f);
            pH.get(7).translateObject(head.x, head.y, 0.0f);
            pH.get(8).translateObject(head.x, head.y, 0.0f);
            pH.get(9).translateObject(head.x, head.y, 0.0f);
            pH.get(10).translateObject(head.x, head.y, 0.0f);
            pH.get(11).translateObject(head.x, head.y, 0.0f);
            pH.get(12).translateObject(head.x, head.y, 0.0f);
            pH.get(13).translateObject(head.x, head.y, 0.0f);
            pH.get(14).translateObject(head.x, head.y, 0.0f);
            pH.get(15).translateObject(head.x, head.y, 0.0f);
            pH.get(16).translateObject(head.x, head.y, 0.0f);
            pH.get(17).translateObject(head.x, head.y, 0.0f);
            pH.get(18).translateObject(head.x, head.y, 0.0f);
            pH.get(19).translateObject(head.x, head.y, 0.0f);
            pH.get(20).translateObject(head.x, head.y, 0.0f);
            pH.get(21).translateObject(head.x, head.y, 0.0f);
            pH.get(22).translateObject(head.x, head.y, 0.0f);
            pH.get(23).translateObject(head.x, head.y, 0.0f);
            pH.get(24).translateObject(head.x, head.y, 0.0f);
            pH.get(25).translateObject(head.x, head.y, 0.0f);
            pH.get(26).translateObject(head.x, head.y, 0.0f);
            pH.get(27).translateObject(head.x, head.y, 0.0f);
            pH.get(28).translateObject(head.x, head.y, 0.0f);
            pH.get(29).translateObject(head.x, head.y, 0.0f);
            pH.get(30).translateObject(head.x, head.y, 0.0f);
            pH.get(31).translateObject(head.x, head.y, 0.0f);
            pH.get(32).translateObject(head.x, head.y, 0.0f);
            pH.get(33).translateObject(head.x, head.y, 0.0f);
        }

        if(window.isKeyPressed(GLFW_KEY_G)){
            Vector3f body = pH.get(0).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
            pH.get(1).translateObject(-body.x, -body.y, 0.0f);
            pH.get(2).translateObject(-body.x, -body.y, 0.0f);
            pH.get(3).translateObject(-body.x, -body.y, 0.0f);
            pH.get(4).translateObject(-body.x, -body.y, 0.0f);
            pH.get(5).translateObject(-body.x, -body.y, 0.0f);
            pH.get(6).translateObject(-body.x, -body.y, 0.0f);
            pH.get(7).translateObject(-body.x, -body.y, 0.0f);
            pH.get(8).translateObject(-body.x, -body.y, 0.0f);
            pH.get(9).translateObject(-body.x, -body.y, 0.0f);
            pH.get(10).translateObject(-body.x, -body.y, 0.0f);
            pH.get(11).translateObject(-body.x, -body.y, 0.0f);
            pH.get(12).translateObject(-body.x, -body.y, 0.0f);
            pH.get(13).translateObject(-body.x, -body.y, 0.0f);
            pH.get(14).translateObject(-body.x, -body.y, 0.0f);
            pH.get(15).translateObject(-body.x, -body.y, 0.0f);
            pH.get(16).translateObject(-body.x, -body.y, 0.0f);
            pH.get(17).translateObject(-body.x, -body.y, 0.0f);
            pH.get(18).translateObject(-body.x, -body.y, 0.0f);
            pH.get(19).translateObject(-body.x, -body.y, 0.0f);
            pH.get(20).translateObject(-body.x, -body.y, 0.0f);
            pH.get(21).translateObject(-body.x, -body.y, 0.0f);
            pH.get(22).translateObject(-body.x, -body.y, 0.0f);
            pH.get(23).translateObject(-body.x, -body.y, 0.0f);
            pH.get(24).translateObject(-body.x, -body.y, 0.0f);
            pH.get(25).translateObject(-body.x, -body.y, 0.0f);
            pH.get(26).translateObject(-body.x, -body.y, 0.0f);
            pH.get(27).translateObject(-body.x, -body.y, 0.0f);
            pH.get(28).translateObject(-body.x, -body.y, 0.0f);
            pH.get(29).translateObject(-body.x, -body.y, 0.0f);
            pH.get(30).translateObject(-body.x, -body.y, 0.0f);
            pH.get(31).translateObject(-body.x, -body.y, 0.0f);
            pH.get(32).translateObject(-body.x, -body.y, 0.0f);
            pH.get(33).translateObject(-body.x, -body.y, 0.0f);
            pH.get(0).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(1).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(2).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(3).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(4).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(5).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(6).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(7).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(8).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(9).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(10).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(11).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(12).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(13).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(14).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(15).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(16).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(17).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(18).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(19).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(20).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(21).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(22).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(23).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(24).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(25).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(26).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(27).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(28).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(29).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(30).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(31).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(32).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(33).translateObject(0.001f, 0.0f, 0.0f);
            pH.get(1).translateObject(body.x, body.y, 0.0f);
            pH.get(2).translateObject(body.x, body.y, 0.0f);
            pH.get(3).translateObject(body.x, body.y, 0.0f);
            pH.get(4).translateObject(body.x, body.y, 0.0f);
            pH.get(5).translateObject(body.x, body.y, 0.0f);
            pH.get(6).translateObject(body.x, body.y, 0.0f);
            pH.get(7).translateObject(body.x, body.y, 0.0f);
            pH.get(8).translateObject(body.x, body.y, 0.0f);
            pH.get(9).translateObject(body.x, body.y, 0.0f);
            pH.get(10).translateObject(body.x, body.y, 0.0f);
            pH.get(11).translateObject(body.x, body.y, 0.0f);
            pH.get(12).translateObject(body.x, body.y, 0.0f);
            pH.get(13).translateObject(body.x, body.y, 0.0f);
            pH.get(14).translateObject(body.x, body.y, 0.0f);
            pH.get(15).translateObject(body.x, body.y, 0.0f);
            pH.get(16).translateObject(body.x, body.y, 0.0f);
            pH.get(17).translateObject(body.x, body.y, 0.0f);
            pH.get(18).translateObject(body.x, body.y, 0.0f);
            pH.get(19).translateObject(body.x, body.y, 0.0f);
            pH.get(20).translateObject(body.x, body.y, 0.0f);
            pH.get(21).translateObject(body.x, body.y, 0.0f);
            pH.get(22).translateObject(body.x, body.y, 0.0f);
            pH.get(23).translateObject(body.x, body.y, 0.0f);
            pH.get(24).translateObject(body.x, body.y, 0.0f);
            pH.get(25).translateObject(body.x, body.y, 0.0f);
            pH.get(26).translateObject(body.x, body.y, 0.0f);
            pH.get(27).translateObject(body.x, body.y, 0.0f);
            pH.get(28).translateObject(body.x, body.y, 0.0f);
            pH.get(29).translateObject(body.x, body.y, 0.0f);
            pH.get(30).translateObject(body.x, body.y, 0.0f);
            pH.get(31).translateObject(body.x, body.y, 0.0f);
            pH.get(32).translateObject(body.x, body.y, 0.0f);
            pH.get(33).translateObject(body.x, body.y, 0.0f);
        }

        if(window.isKeyPressed(GLFW_KEY_H)){
            Vector3f body = pH.get(0).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
            pH.get(1).translateObject(-body.x, -body.y, 0.0f);
            pH.get(2).translateObject(-body.x, -body.y, 0.0f);
            pH.get(3).translateObject(-body.x, -body.y, 0.0f);
            pH.get(4).translateObject(-body.x, -body.y, 0.0f);
            pH.get(5).translateObject(-body.x, -body.y, 0.0f);
            pH.get(6).translateObject(-body.x, -body.y, 0.0f);
            pH.get(7).translateObject(-body.x, -body.y, 0.0f);
            pH.get(8).translateObject(-body.x, -body.y, 0.0f);
            pH.get(9).translateObject(-body.x, -body.y, 0.0f);
            pH.get(10).translateObject(-body.x, -body.y, 0.0f);
            pH.get(11).translateObject(-body.x, -body.y, 0.0f);
            pH.get(12).translateObject(-body.x, -body.y, 0.0f);
            pH.get(13).translateObject(-body.x, -body.y, 0.0f);
            pH.get(14).translateObject(-body.x, -body.y, 0.0f);
            pH.get(15).translateObject(-body.x, -body.y, 0.0f);
            pH.get(16).translateObject(-body.x, -body.y, 0.0f);
            pH.get(17).translateObject(-body.x, -body.y, 0.0f);
            pH.get(18).translateObject(-body.x, -body.y, 0.0f);
            pH.get(19).translateObject(-body.x, -body.y, 0.0f);
            pH.get(20).translateObject(-body.x, -body.y, 0.0f);
            pH.get(21).translateObject(-body.x, -body.y, 0.0f);
            pH.get(22).translateObject(-body.x, -body.y, 0.0f);
            pH.get(23).translateObject(-body.x, -body.y, 0.0f);
            pH.get(24).translateObject(-body.x, -body.y, 0.0f);
            pH.get(25).translateObject(-body.x, -body.y, 0.0f);
            pH.get(26).translateObject(-body.x, -body.y, 0.0f);
            pH.get(27).translateObject(-body.x, -body.y, 0.0f);
            pH.get(28).translateObject(-body.x, -body.y, 0.0f);
            pH.get(29).translateObject(-body.x, -body.y, 0.0f);
            pH.get(30).translateObject(-body.x, -body.y, 0.0f);
            pH.get(31).translateObject(-body.x, -body.y, 0.0f);
            pH.get(32).translateObject(-body.x, -body.y, 0.0f);
            pH.get(33).translateObject(-body.x, -body.y, 0.0f);
            pH.get(0).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(1).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(2).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(3).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(4).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(5).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(6).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(7).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(8).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(9).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(10).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(11).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(12).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(13).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(14).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(15).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(16).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(17).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(18).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(19).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(20).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(21).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(22).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(23).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(24).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(25).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(26).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(27).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(28).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(29).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(30).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(31).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(32).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(33).translateObject(-0.001f, 0.0f, 0.0f);
            pH.get(1).translateObject(body.x, body.y, 0.0f);
            pH.get(2).translateObject(body.x, body.y, 0.0f);
            pH.get(3).translateObject(body.x, body.y, 0.0f);
            pH.get(4).translateObject(body.x, body.y, 0.0f);
            pH.get(5).translateObject(body.x, body.y, 0.0f);
            pH.get(6).translateObject(body.x, body.y, 0.0f);
            pH.get(7).translateObject(body.x, body.y, 0.0f);
            pH.get(8).translateObject(body.x, body.y, 0.0f);
            pH.get(9).translateObject(body.x, body.y, 0.0f);
            pH.get(10).translateObject(body.x, body.y, 0.0f);
            pH.get(11).translateObject(body.x, body.y, 0.0f);
            pH.get(12).translateObject(body.x, body.y, 0.0f);
            pH.get(13).translateObject(body.x, body.y, 0.0f);
            pH.get(14).translateObject(body.x, body.y, 0.0f);
            pH.get(15).translateObject(body.x, body.y, 0.0f);
            pH.get(16).translateObject(body.x, body.y, 0.0f);
            pH.get(17).translateObject(body.x, body.y, 0.0f);
            pH.get(18).translateObject(body.x, body.y, 0.0f);
            pH.get(19).translateObject(body.x, body.y, 0.0f);
            pH.get(20).translateObject(body.x, body.y, 0.0f);
            pH.get(21).translateObject(body.x, body.y, 0.0f);
            pH.get(22).translateObject(body.x, body.y, 0.0f);
            pH.get(23).translateObject(body.x, body.y, 0.0f);
            pH.get(24).translateObject(body.x, body.y, 0.0f);
            pH.get(25).translateObject(body.x, body.y, 0.0f);
            pH.get(26).translateObject(body.x, body.y, 0.0f);
            pH.get(27).translateObject(body.x, body.y, 0.0f);
            pH.get(28).translateObject(body.x, body.y, 0.0f);
            pH.get(29).translateObject(body.x, body.y, 0.0f);
            pH.get(30).translateObject(body.x, body.y, 0.0f);
            pH.get(31).translateObject(body.x, body.y, 0.0f);
            pH.get(32).translateObject(body.x, body.y, 0.0f);
            pH.get(33).translateObject(body.x, body.y, 0.0f);
        }

//        if(window.isKeyPressed(GLFW_KEY_G)){
////            camera.moveBackwards(0.01f);
//            Vector3f body = pY.get(0).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            pY.get(1).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(2).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(3).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(4).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(5).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(6).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(7).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(8).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(9).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(10).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(11).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(12).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(0).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(1).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(2).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(3).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(4).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(5).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(6).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(7).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(8).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(9).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(10).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(11).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(12).translateObject(0.001f, 0.0f, 0.0f);
//            pY.get(1).translateObject(body.x, body.y, 0.0f);
//            pY.get(2).translateObject(body.x, body.y, 0.0f);
//            pY.get(3).translateObject(body.x, body.y, 0.0f);
//            pY.get(4).translateObject(body.x, body.y, 0.0f);
//            pY.get(5).translateObject(body.x, body.y, 0.0f);
//            pY.get(6).translateObject(body.x, body.y, 0.0f);
//            pY.get(7).translateObject(body.x, body.y, 0.0f);
//            pY.get(8).translateObject(body.x, body.y, 0.0f);
//            pY.get(9).translateObject(body.x, body.y, 0.0f);
//            pY.get(10).translateObject(body.x, body.y, 0.0f);
//            pY.get(11).translateObject(body.x, body.y, 0.0f);
//            pY.get(12).translateObject(body.x, body.y, 0.0f);
//        }


//        if(window.isKeyPressed(GLFW_KEY_H)){
//            Vector3f body = pY.get(0).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            pY.get(4).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(5).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(6).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(7).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(8).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(9).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(10).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(11).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(12).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(4).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(5).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(6).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(7).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(8).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(9).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(10).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(11).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(12).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
//            pY.get(4).translateObject(body.x, body.y, 0.0f);
//            pY.get(5).translateObject(body.x, body.y, 0.0f);
//            pY.get(6).translateObject(body.x, body.y, 0.0f);
//            pY.get(7).translateObject(body.x, body.y, 0.0f);
//            pY.get(8).translateObject(body.x, body.y, 0.0f);
//            pY.get(9).translateObject(body.x, body.y, 0.0f);
//            pY.get(10).translateObject(body.x, body.y, 0.0f);
//            pY.get(11).translateObject(body.x, body.y, 0.0f);
//            pY.get(12).translateObject(body.x, body.y, 0.0f);
//        }



        if(window.isKeyPressed(GLFW_KEY_I)){
//            pY.get(1).rotateObject((float) Math.toRadians(0.5f),1f,0.0f,0.0f);
            Vector3f head = pY.get(1).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
            pY.get(2).translateObject(-head.x, -head.y, 0.0f);
            pY.get(3).translateObject(-head.x, -head.y, 0.0f);

            for(float i = 0f ; i < Math.toRadians(50f) ; i += 2f){
                pY.get(2).rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
                System.out.println(i);
            }

//            pY.get(3).rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
            pY.get(2).translateObject(head.x, head.y, 0.0f);
            pY.get(3).translateObject(head.x, head.y, 0.0f);
//            camera.moveForward(0.001f);
        }

        if(window.isKeyPressed(GLFW_KEY_J)){
            Vector3f body = pY.get(0).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
            Vector3f bahu1 = pY.get(4).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
            Vector3f bahu2 = pY.get(5).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
            pY.get(4).translateObject(-body.x, -body.y, 0.0f);
            pY.get(5).translateObject(-body.x, -body.y, 0.0f);
            pY.get(4).rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
            pY.get(5).rotateObject((float) Math.toRadians(0.5f), -1.0f, 0.0f, 0.0f);
            pY.get(4).translateObject(body.x, body.y, 0.0f);
            pY.get(5).translateObject(body.x, body.y, 0.0f);
            pY.get(11).translateObject(-body.x, -body.y, 0.0f);
            pY.get(12).translateObject(-body.x, -body.y, 0.0f);
            pY.get(11).rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
            pY.get(12).rotateObject((float) Math.toRadians(0.5f), -1.0f, 0.0f, 0.0f);
            pY.get(11).translateObject(body.x, body.y, 0.0f);
            pY.get(12).translateObject(body.x, body.y, 0.0f);
        }
        if(window.isKeyPressed(GLFW_KEY_W)){
            pZ.get(0).translateObject(0.0f, 0.0f, 0.008f);
            pZ.get(1).translateObject(0.0f, 0.0f, 0.008f);
            pZ.get(2).translateObject(0.0f, 0.0f, 0.008f);
            pZ.get(3).translateObject(0.0f, 0.0f, 0.008f);
        }

        if(window.isKeyPressed(GLFW_KEY_S)){
            pZ.get(0).translateObject(0.0f, 0.0f, -0.008f);
            pZ.get(1).translateObject(0.0f, 0.0f, -0.008f);
            pZ.get(2).translateObject(0.0f, 0.0f, -0.008f);
            pZ.get(3).translateObject(0.0f, 0.0f, -0.008f);
        }
    }

    public void loop() {

        while (window.isOpen()) {
            window.update();
            glClearColor(0.152f, 0.96f, 0.235f, 1.0f); // RapidTables.com (RGB color code chart)
            GL.createCapabilities();
            input();
//            for (Sphere2 object : TTSRY) {
//                object.draw(camera, projection);
//            }
            for(Sphere2 obj : pY){
                obj.draw(camera, projection);
            }
            for(Sphere2 obj : pH){
                obj.draw(camera, projection);
            }
            for(Object2d obj : pZ){
                obj.draw(camera, projection);
            }
            //Restore State
            glDisableVertexAttribArray(0);
            // Pull for window events
            // The key callback above will only be
            // invoked during this call
            glfwPollEvents();
        }
    }

    public static void main(String[] args) {
        new MainProject().run();
    }
}
