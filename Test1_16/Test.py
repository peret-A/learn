# # 导入json
# import json
#
# # 准备符合json格式的python数据
# data=[{"name":"小明","age":15},{"name":"小红","age":16},{"name":"奥特曼","age":186}]
# print(type(data))
# print(data)
# # 转换成json数据
# data=json.dumps(data)
# print(type(data))
# print(data)
#
# # 转换成python数据
# data=json.loads(data)
# print(type(data))
# print(data)


# import pyecharts.options as opts
# from pyecharts.charts import Line
#
# """
# Gallery 使用 pyecharts 1.1.0
# 参考地址: https://echarts.apache.org/examples/editor.html?c=line-marker
#
# 目前无法实现的功能:
#
# 1、最低气温的最高值暂时无法和 Echarts 的示例完全复刻
# """
#
# week_name_list = ["周一", "周二", "周三", "周四", "周五", "周六", "周日"]
# high_temperature = [11, 11, 15, 13, 12, 13, 10]
# low_temperature = [1, -2, 2, 5, 3, 2, 0]
#
#
# (
#     Line()
#     .add_xaxis(xaxis_data=week_name_list)
#     .add_yaxis(
#         series_name="最高气温",
#         y_axis=high_temperature,
#         markpoint_opts=opts.MarkPointOpts(
#             data=[
#                 opts.MarkPointItem(type_="max", name="最大值"),
#                 opts.MarkPointItem(type_="min", name="最小值"),
#             ]
#         ),
#         markline_opts=opts.MarkLineOpts(
#             data=[opts.MarkLineItem(type_="average", name="平均值")]
#         ),
#     )
#     .add_yaxis(
#         series_name="最低气温",
#         y_axis=low_temperature,
#         markpoint_opts=opts.MarkPointOpts(
#             data=[opts.MarkPointItem(value=-2, name="周最低", x=1, y=-1.5)]
#         ),
#         markline_opts=opts.MarkLineOpts(
#             data=[
#                 opts.MarkLineItem(type_="average", name="平均值"),
#                 opts.MarkLineItem(symbol="none", x="90%", y="max"),
#                 opts.MarkLineItem(symbol="circle", type_="max", name="最高点"),
#             ]
#         ),
#     )
#     .set_global_opts(
#         title_opts=opts.TitleOpts(title="未来一周气温变化", subtitle="纯属虚构"),
#         tooltip_opts=opts.TooltipOpts(trigger="axis"),
#         toolbox_opts=opts.ToolboxOpts(is_show=True),
#         xaxis_opts=opts.AxisOpts(type_="category", boundary_gap=False),
#     )
#     .render("temperature_change_line_chart.html")
# )

# import pyecharts.options as opts
# from pyecharts.charts import Line
# from pyecharts.faker import Faker
#
#
# c = (
#     Line()
#     .add_xaxis(Faker.choose())
#     .add_yaxis("商家A", Faker.values(), is_smooth=True)
#     .add_yaxis("商家B", Faker.values(), is_smooth=True)
#     .set_series_opts(
#         areastyle_opts=opts.AreaStyleOpts(opacity=0.5),
#         label_opts=opts.LabelOpts(is_show=False),
#     )
#     .set_global_opts(
#         title_opts=opts.TitleOpts(title="Line-面积图（紧贴 Y 轴）"),
#         xaxis_opts=opts.AxisOpts(
#             axistick_opts=opts.AxisTickOpts(is_align_with_label=True),
#             is_scale=False,
#             boundary_gap=False,
#         ),
#     )
#     .render("line_areastyle_boundary_gap.html")
# )
#

# #导入preachrts包
# from pyecharts.charts import Line
# from pyecharts.options import TitleOpts,LegendOpts,VisualMapOpts,ToolboxOpts
# #得到折线图对象
# line=Line()
#
# #添加x轴数据
# line.add_xaxis(["中国","美国","英国"])
#
# #添加y轴数据
# line.add_yaxis("GDpP",[30,20,10])
# #全局配置
# line.set_global_opts(
#     title_opts=TitleOpts(title="GDP折线图",pos_left="center",pos_bottom="1%"),
#     # 是否展示
#     legend_opts=LegendOpts(is_show=True),
#     toolbox_opts=ToolboxOpts(is_show=True),
#     # 工具箱
#     visualmap_opts=VisualMapOpts(is_show=True)
# )
# #生成图表
# line.render()
#
# import pygame
# import sys
# import random
#
# # 初始化pygame
# pygame.init()
#
# # 设置屏幕大小
# screen_size = (640, 480)
# screen = pygame.display.set_mode(screen_size)
#
# # 设置游戏标题
# pygame.display.set_caption("贪吃蛇：按p键暂停/继续")
#
# # 定义颜色
# WHITE = (255, 255, 255)
# GREEN = (0, 255, 0)
# RED = (255, 0, 0)
#
# # 蛇的初始位置
# snake_pos = [[100, 100], [80, 100], [60, 100]]
#
# # 食物的初始位置
# food_pos = [300, 300]
#
# # 蛇的初始速度
# snake_speed = [20, 0]
#
# # 初始化分数
# score = 0
#
# # 创建字体对象
# font = pygame.font.Font(None, 36)
#
# # 游戏暂停标志
# paused = False
#
# # 主循环
# while True:
#     # 处理游戏事件
#     for event in pygame.event.get():
#         if event.type == pygame.QUIT:
#             pygame.quit()
#             sys.exit()
#         elif event.type == pygame.KEYDOWN:
#             if event.key == pygame.K_p:  # 按 P 键暂停或继续
#                 paused = not paused
#             if not paused:
#                 if event.key == pygame.K_UP and snake_speed != [0, 20]:
#                     snake_speed = [0, -20]
#                 elif event.key == pygame.K_DOWN and snake_speed != [0, -20]:
#                     snake_speed = [0, 20]
#                 elif event.key == pygame.K_LEFT and snake_speed != [20, 0]:
#                     snake_speed = [-20, 0]
#                 elif event.key == pygame.K_RIGHT and snake_speed != [-20, 0]:
#                     snake_speed = [20, 0]
#
#     if not paused:
#         # 更新蛇的位置
#         snake_pos.insert(0, [snake_pos[0][0] + snake_speed[0], snake_pos[0][1] + snake_speed[1]])
#
#         # 检查蛇头是否碰到墙壁，如果是则“经过墙壁”
#         if snake_pos[0][0] < 0:
#             snake_pos[0][0] = screen_size[0] - 20
#         elif snake_pos[0][0] >= screen_size[0]:
#             snake_pos[0][0] = 0
#         elif snake_pos[0][1] < 0:
#             snake_pos[0][1] = screen_size[1] - 20
#         elif snake_pos[0][1] >= screen_size[1]:
#             snake_pos[0][1] = 0
#
#         # 检查蛇头是否碰到食物
#         if snake_pos[0] == food_pos:
#             food_pos = [random.randrange(1, screen_size[0] // 20) * 20, random.randrange(1, screen_size[1] // 20) * 20]
#             score += 1  # 计分
#         else:
#             snake_pos.pop()
#
#     # 绘制游戏界面
#     screen.fill(WHITE)
#
#     for pos in snake_pos:
#         pygame.draw.rect(screen, GREEN, pygame.Rect(pos[0], pos[1], 20, 20))
#
#     pygame.draw.rect(screen, RED, pygame.Rect(food_pos[0], food_pos[1], 20, 20))
#
#     # 显示得分
#     score_text = font.render("Score: " + str(score), True, (0, 0, 0))
#     screen.blit(score_text, (10, 10))
#
#     # 如果游戏暂停，则显示暂停提示
#     if paused:
#         pause_text = font.render("Paused. Press P to continue.", True, (0, 0, 0))
#         screen.blit(pause_text, (
#         screen_size[0] // 2 - pause_text.get_width() // 2, screen_size[1] // 2 - pause_text.get_height() // 2))
#
#     pygame.display.flip()  # 更新屏幕显示
#
#     # 控制游戏速度
#     pygame.time.Clock().tick(6)


import pygame
import time
import random

# 设置蛇的速度
snake_speed = 15

# 窗口颜色
white = pygame.Color(255, 255, 255)

# 蛇的颜色
green = pygame.Color(0, 255, 0)

# 食物的颜色
red = pygame.Color(255, 0, 0)

# 初始化pygame
pygame.init()

# 初始化游戏窗口
window = pygame.display.set_mode((720, 480))

# FPS（帧率）控制器
fps = pygame.time.Clock()

# 定义蛇的默认位置
snake_position = [100, 50]

# 定义蛇身体的前四个块
snake_body = [[100, 50], [90, 50], [80, 50], [70, 50]]

# 食物位置
food_position = [random.randrange(1, 72) * 10, random.randrange(1, 48) * 10]

# 蛇吃到食物时
food_spawn = True

# 设置默认的蛇的方向为向右
direction = 'RIGHT'

# 初始分数
score = 0


def game_over():
    # 设置字体以显示分数
    # font = pygame.font.SysFont(None, 26)
    font = pygame.font.Font("C:\\Windows\\Fonts\\simsun.ttc", 26)  # 显示中文文字
    score_text = font.render('得分: ' + str(score), True, green)
    window.blit(score_text, [320, 240])

    # 显示信息
    again_text = font.render('游戏结束！按任意键重新开始', True, red)  # 修改颜色变量为white
    window.blit(again_text, [160, 280])

    pygame.display.flip()  # 使用 flip() 来更新整个屏幕

    # 等待用户按键然后重新开始游戏
    waiting_for_input = True
    while waiting_for_input:
        for event in pygame.event.get():
            if event.type == pygame.KEYDOWN:
                waiting_for_input = False
            elif event.type == pygame.QUIT:
                pygame.quit()
                quit()
    # 游戏重新开始
    main()


# 游戏的主逻辑
def main():
    global direction, food_position, food_spawn, score
    # 重置游戏
    score = 0
    snake_position = [100, 50]
    snake_body = [[100, 50], [90, 50], [80, 50], [70, 50]]
    direction = 'RIGHT'
    food_position = [random.randrange(1, 72) * 10, random.randrange(1, 48) * 10]
    food_spawn = True
    while True:
        # 处理按键事件
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
            elif event.type == pygame.KEYDOWN:
                if event.key == pygame.K_UP and direction != 'DOWN':
                    direction = 'UP'
                if event.key == pygame.K_DOWN and direction != 'UP':
                    direction = 'DOWN'
                if event.key == pygame.K_LEFT and direction != 'RIGHT':
                    direction = 'LEFT'
                if event.key == pygame.K_RIGHT and direction != 'LEFT':
                    direction = 'RIGHT'

        # 移动蛇
        if direction == 'UP':
            snake_position[1] -= 10
        if direction == 'DOWN':
            snake_position[1] += 10
        if direction == 'LEFT':
            snake_position[0] -= 10
        if direction == 'RIGHT':
            snake_position[0] += 10

        # 蛇身体增长机制
        snake_body.insert(0, list(snake_position))
        if snake_position[0] == food_position[0] and snake_position[1] == food_position[1]:
            score += 1
            food_spawn = False
        else:
            snake_body.pop()

        if not food_spawn:
            food_position = [random.randrange(1, 72) * 10, random.randrange(1, 48) * 10]
        food_spawn = True

        # 图形界面
        window.fill(white)

        for pos in snake_body:
            pygame.draw.rect(window, green, pygame.Rect(pos[0], pos[1], 10, 10))

        pygame.draw.rect(window, red, pygame.Rect(food_position[0], food_position[1], 10, 10))

        # 游戏结束条件
        if snake_position[0] < 0 or snake_position[0] > 710 or snake_position[1] < 0 or snake_position[1] > 470:
            game_over()
            break  # 结束游戏后跳出循环
        for block in snake_body[1:]:
            if snake_position[0] == block[0] and snake_position[1] == block[1]:
                game_over()
                break  # 结束游戏后跳出循环

        # 更新显示
        pygame.display.update()

        # 每秒帧数/刷新率
        fps.tick(snake_speed)


# 运行主函数
if __name__ == "__main__":
    main()