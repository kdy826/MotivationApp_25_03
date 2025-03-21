package org.example.motivation.entity;

public class Motivation {
  public  int id;
  public    String body;
  public    String source;



    public Motivation(int id, String body, String source) {  //여기에 add 정보를 저장
        this.id = id;
        this.body = body;
        this.source = source;


    }


    @Override
    public String toString() {
        return "Motivation{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    public String getSource() {
        return source;
    }

    public Object getId() {
    return id;
    }

    public Object getBody() {
        return body;
    }
}

