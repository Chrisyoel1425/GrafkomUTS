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
    ArrayList<Sphere2> pJ = new ArrayList<>(); //Jessica
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

        pZ.get(0).getChildObject().add(new Sphere2(
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
                0.15f, 0.3f, 0.05f,
                30, 15, 1
        ));
        pZ.get(0).getChildObject().get(0).translateObject(0.8f, 0.0f, -1.8f);

        pZ.get(0).getChildObject().add(new Sphere2(
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
                0.15f, 0.3f, 0.05f,
                30, 15, 1
        ));
        pZ.get(0).getChildObject().get(1).translateObject(1f, 0.0f, -1.8f);

        pZ.get(0).getChildObject().add(new Sphere2(
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
                0.15f, 0.3f, 0.05f,
                30, 15, 1
        ));
        pZ.get(0).getChildObject().get(2).translateObject(0.8f, 0.4f, -1.8f);

        pZ.get(0).getChildObject().add(new Sphere2(
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
                0.15f, 0.3f, 0.05f,
                30, 15, 1
        ));
        pZ.get(0).getChildObject().get(3).translateObject(1f, 0.4f, -1.8f);

        pZ.get(0).getChildObject().add(new Sphere2(
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
                0.15f, 0.3f, 0.05f,
                30, 15, 1
        ));
        pZ.get(0).getChildObject().get(4).translateObject(0.8f, 0.8f, -1.8f);

        pZ.get(0).getChildObject().add(new Sphere2(
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
                0.15f, 0.3f, 0.05f,
                30, 15, 1
        ));
        pZ.get(0).getChildObject().get(5).translateObject(1f, 0.8f, -1.8f);

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

        pZ.get(1).getChildObject().add(new Sphere2(
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
                0.38f, 0.15f, 0.05f,
                30, 15, 1
        ));
        pZ.get(1).getChildObject().get(0).translateObject(-0.9f, 0.0f, -1.8f);

        pZ.get(1).getChildObject().add(new Sphere2(
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
                0.38f, 0.15f, 0.05f,
                30, 15, 1
        ));
        pZ.get(1).getChildObject().get(1).translateObject(-0.9f, 0.2f, -1.8f);

        pZ.get(1).getChildObject().add(new Sphere2(
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
                0.38f, 0.15f, 0.05f,
                30, 15, 1
        ));
        pZ.get(1).getChildObject().get(2).translateObject(-0.9f, 0.4f, -1.8f);

        pZ.get(1).getChildObject().add(new Sphere2(
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
                0.38f, 0.15f, 0.05f,
                30, 15, 1
        ));
        pZ.get(1).getChildObject().get(3).translateObject(-0.9f, 0.6f, -1.8f);

        pZ.get(1).getChildObject().add(new Sphere2(
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
                0.38f, 0.15f, 0.05f,
                30, 15, 1
        ));
        pZ.get(1).getChildObject().get(4).translateObject(-0.9f, 0.8f, -1.8f);

        pZ.get(1).getChildObject().add(new Sphere2(
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
                0.38f, 0.15f, 0.05f,
                30, 15, 1
        ));
        pZ.get(1).getChildObject().get(5).translateObject(-0.9f, 1.0f, -1.8f);


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

        pZ.get(2).getChildObject().add(new Sphere2(
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
                0.03f, 1.2f, 0.05f,
                30, 15, 1
        ));
        pZ.get(2).getChildObject().get(0).translateObject(1f, 0.5f, -3.8f);


        pZ.get(2).getChildObject().add(new Sphere2(
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
                0.03f, 1.2f, 0.05f,
                30, 15, 1
        ));
        pZ.get(2).getChildObject().get(1).translateObject(0.8f, 0.5f, -3.8f);

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
                0.5f, 1f, 0.5f,
                30, 15, 1
        ));
        pZ.get(3).translateObject(-0.9f, 0.3f, -4f);

        pZ.get(3).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 1.0f, 1.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.2f, 0.2f, 0.15f,
                30, 15, 9
        ));
        pZ.get(3).getChildObject().get(0).translateObject(-0.925f, 0.8f, -4.0f);

//        pZ.add(new Sphere2(
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
//                10f, 10f, 10f,
//                30, 15, 1
//        ));
//        pZ.get(4).translateObject(0.0f, -5.2f, -4f);


        pY.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 0.0f, 0.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.35f, 0.3f, 0.2f,
                15, 30, 11
        ));
        pY.get(0).rotateObject(4.75f, 0f, 0f, 1f);
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


        //Jessica
        //Badan
        //tengah
        pJ.add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(1.0f, 1.0f, 0.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.49f, 0.34f, 0.0f,
                30, 15, 1
        ));
        pJ.get(0).translateObject(0.599f, -0.2f, 0.0f);

        //atas
        pJ.get(0).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(   1.0f, 1.0f, 0.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.25f, 0.25f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(0).translateObject(0.6f, 0.0f, 0.0f);

        //bawah
        pJ.get(0).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(   0.0f, 0.20f, 0.44f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.255f, 0.15f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(1).translateObject(0.6f, -0.45f, 0.0f);

        //kacamata
        //bagian hitam
        pJ.get(0).getChildObject().add(new Sphere2(
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
                0.4f, 0.1f, 0.0f,
                30, 15, 1
        ));
        pJ.get(0).getChildObject().get(2).translateObject(0.49f, -0.04f, 0.35f);

        //buletan kiri
        pJ.get(0).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.49f, 0.49f, 0.49f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.08f, 0.08f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(3).translateObject(0.39f, -0.045f, 0.45f);

        //buletan kanan
        pJ.get(0).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.49f, 0.49f, 0.49f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.08f, 0.08f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(4).translateObject(0.53f, -0.045f, 0.45f);


        //mata luar kiri
        pJ.get(0).getChildObject().add(new Sphere2(
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
                0.06f, 0.06f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(5).translateObject(0.37f, -0.045f, 0.5f);

        //mata luar kanan
        pJ.get(0).getChildObject().add(new Sphere2(
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
                0.06f, 0.06f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(6).translateObject(0.52f, -0.045f, 0.5f);

        //mata dalam kiri
        pJ.get(0).getChildObject().add(new Sphere2(
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
                0.03f, 0.03f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(7).translateObject(0.36f, -0.045f, 0.55f);

        //mata dalem kanan
        pJ.get(0).getChildObject().add(new Sphere2(
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
                0.03f, 0.03f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(8).translateObject(0.51f, -0.045f, 0.55f);

        //celana
        pJ.get(0).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.20f, 0.44f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.4f, 0.1f, 0.0f,
                30, 15, 1
        ));
        pJ.get(0).getChildObject().get(9).translateObject(0.5f, -0.3f, 0.35f);

        //kaki kiri
        pJ.get(0).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.20f, 0.44f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.1f, 0.15f, 0.0f,
                30, 15, 1
        ));
        pJ.get(0).getChildObject().get(10).translateObject(0.4f, -0.5f, 0.35f);

        //kaki kanan
        pJ.get(0).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(0.0f, 0.20f, 0.44f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.1f, 0.15f, 0.0f,
                30, 15, 1
        ));
        pJ.get(0).getChildObject().get(11).translateObject(0.57f, -0.5f, 0.35f);

        //sepatu
        pJ.get(0).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(   0.0f, 0.0f, 0.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.09f, 0.05f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(12).translateObject(0.43f, -0.7f, 0.0f);
        //sepatu
        pJ.get(0).getChildObject().add(new Sphere2(
                Arrays.asList(
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.vert", GL_VERTEX_SHADER),
                        new ShaderProgram.ShaderModuleData(
                                "resources/scene.frag", GL_FRAGMENT_SHADER)
                ),
                new ArrayList<>(),
                new Vector4f(   0.0f, 0.0f, 0.0f, 1.0f),
                0.5,
                new ArrayList<>(List.of(0.0f, 0.0f, 0.0f)),
                0.09f, 0.05f, 0.0f,
                30, 15, 8
        ));
        pJ.get(0).getChildObject().get(13).translateObject(0.66f, -0.7f, 0.0f);

    }

    public void input() {
        List<ShaderProgram.ShaderModuleData> shader = Arrays.asList(
                new ShaderProgram.ShaderModuleData(
                        "resources/scene.vert", GL_VERTEX_SHADER),
                new ShaderProgram.ShaderModuleData(
                        "resources/scene.frag", GL_FRAGMENT_SHADER)
        );


        //ISI COMMENT MAU APA AJA

        if(window.isKeyPressed(GLFW_KEY_J)) {
//            camera.moveBackwards(0.01f);
            pJ.get(0).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(0).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(1).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(2).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(3).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(4).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(5).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(6).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(7).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(8).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(9).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(10).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(11).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(12).translateObject(0.001f, 0.0f, 0.0f);
            pJ.get(0).getChildObject().get(13).translateObject(0.001f, 0.0f, 0.0f);


            if (window.isKeyPressed(GLFW_KEY_K)) {
                for (Sphere2 i : pJ) {
                    i.rotateObject(0.01f, 1f, 0f, 0f);
                    Vector3f semua = pJ.get(0).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
                    pJ.get(0).getChildObject().get(0).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(1).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(2).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(3).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(4).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(5).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(6).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(7).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(8).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(9).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(10).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(11).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(12).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(13).translateObject(-semua.x, -semua.y, 0.0f);
                    pJ.get(0).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(0).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(1).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(2).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(3).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(4).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(5).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(6).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(7).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(8).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(9).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(10).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(11).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(12).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(13).rotateObject((float) Math.toRadians(0.5f), 0.0f, 1f, 0.0f);
                    pJ.get(0).getChildObject().get(0).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(1).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(2).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(3).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(4).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(5).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(6).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(7).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(8).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(9).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(10).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(11).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(12).translateObject(semua.x, semua.y, 0.0f);
                    pJ.get(0).getChildObject().get(13).translateObject(semua.x, semua.y, 0.0f);

                }
            }
        }

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

//        if(window.isKeyPressed(GLFW_KEY_J)){
//            Vector3f body = pY.get(0).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            Vector3f bahu1 = pY.get(4).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            Vector3f bahu2 = pY.get(5).getModel().transformPosition(new Vector3f(0.0f, 0.0f, 0.0f));
//            pY.get(4).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(5).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(4).rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
//            pY.get(5).rotateObject((float) Math.toRadians(0.5f), -1.0f, 0.0f, 0.0f);
//            pY.get(4).translateObject(body.x, body.y, 0.0f);
//            pY.get(5).translateObject(body.x, body.y, 0.0f);
//            pY.get(11).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(12).translateObject(-body.x, -body.y, 0.0f);
//            pY.get(11).rotateObject((float) Math.toRadians(0.5f), 1.0f, 0.0f, 0.0f);
//            pY.get(12).rotateObject((float) Math.toRadians(0.5f), -1.0f, 0.0f, 0.0f);
//            pY.get(11).translateObject(body.x, body.y, 0.0f);
//            pY.get(12).translateObject(body.x, body.y, 0.0f);
//        }
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

        if(window.isKeyPressed(GLFW_KEY_D)){
            camera.moveRight(0.01f);
        }

        if(window.isKeyPressed(GLFW_KEY_A)){
            camera.moveLeft(0.01f);
        }
    }

    public void loop() {

        while (window.isOpen()) {
            window.update();
            glClearColor(0.152f, 0.96f, 0.235f, 1.0f); // RapidTables.com (RGB color code chart)
            GL.createCapabilities();
            input();
            for(Sphere2 obj : pY){
                obj.draw(camera, projection);
            }
            for(Sphere2 obj : pH){
                obj.draw(camera, projection);
            }
            for(Sphere2 obj : pJ){
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
