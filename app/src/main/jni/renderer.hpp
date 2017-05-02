#ifndef __EASYAR_SAMPLE_UTILITY_SIMPLERENDERER_H__
#define __EASYAR_SAMPLE_UTILITY_SIMPLERENDERER_H__

#include "easyar/matrix.hpp"

namespace EasyAR{
    namespace samples{

        class Renderer
        {
        public:
            void init();
            void render(const Matrix44F& projectionMatrix, const Matrix44F& cameraview, Vec2F size);
        private:
            unsigned int program_box;
            int pos_coord_box;
            int pos_color_box;
            int pos_trans_box;
            int pos_proj_box;
            unsigned int vbo_coord_box;
            unsigned int vbo_color_box;
            unsigned int vbo_color_box_2;
            unsigned int vbo_faces_box;
        };

    }
}
#endif
