package com.baway.yuekao4.bean;

import java.util.List;

/**
 * @author 任珏
 * @类的用途
 * @date 2017/4/28 18:40
 */
public class DataBean {
    public List<Data> data;

    @Override
    public String toString() {
        return "DataBean{" +
                "data=" + data +
                '}';
    }
    public class Data{
        public String img;
        public String introduction;
        public String occupation;
        public String title;
        public int userAge;

        @Override
        public String toString() {
            return "Data{" +
                    "img='" + img + '\'' +
                    ", introduction='" + introduction + '\'' +
                    ", occupation='" + occupation + '\'' +
                    ", title='" + title + '\'' +
                    ", userAge=" + userAge +
                    '}';
        }
    }
}
