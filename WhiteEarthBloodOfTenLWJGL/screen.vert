varying vec4 vertColor;

void main(){
    gl_Position = gl_ModelViewProjectionMatrixgl_Vertex;
    vertColor = vec4(0.6, 0.3, 0.4, 1.0);
}