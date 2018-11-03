package com.sgr.meijia.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Material {
        @Id
        @GeneratedValue     //自增id
        Integer material_id;

        Integer material_category_id;//父类id

        String name;

        String remark; //备注

        String Image_url;//图片资源URL

        String separator_left_ratio;//左侧分隔符位置对比素材宽度的比例

        String separator_right_ratio;//右侧分隔符位置对比素材宽度的比例

        public Material() {
        }

        public Integer getMaterial_id() {
                return material_id;
        }

        public void setMaterial_id(Integer material_id) {
                this.material_id = material_id;
        }

        public Integer getMaterial_category_id() {
                return material_category_id;
        }

        public void setMaterial_category_id(Integer material_category_id) {
                this.material_category_id = material_category_id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getRemark() {
                return remark;
        }

        public void setRemark(String remark) {
                this.remark = remark;
        }

        public String getImage_url() {
                return Image_url;
        }

        public void setImage_url(String image_url) {
                Image_url = image_url;
        }

        public String getSeparator_left_ratio() {
                return separator_left_ratio;
        }

        public void setSeparator_left_ratio(String separator_left_ratio) {
                this.separator_left_ratio = separator_left_ratio;
        }

        public String getSeparator_right_ratio() {
                return separator_right_ratio;
        }

        public void setSeparator_right_ratio(String separator_right_ratio) {
                this.separator_right_ratio = separator_right_ratio;
        }
}
