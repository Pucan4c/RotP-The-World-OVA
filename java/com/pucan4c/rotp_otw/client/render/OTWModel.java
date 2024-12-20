package com.pucan4c.rotp_otw.client.render;

import com.pucan4c.rotp_otw.action.stand.*;
import com.pucan4c.rotp_otw.entity.OTWEntity;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPoseTransition;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.MeshModelBox;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPoseTransitionMultiple;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;

import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.Direction;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.vector.Vector3f;

public class OTWModel extends HumanoidStandModel<OTWEntity> {
    private final ModelRenderer headpiece;
    private final ModelRenderer leftCable;
    private final ModelRenderer rightCable;
    private final ModelRenderer slopeNew;
    private final ModelRenderer faceRightNew;
    private final ModelRenderer faceLeftNew;
    private final ModelRenderer heartSmallHead;
    private final ModelRenderer smallHeartCube4;
    private final ModelRenderer smallHeartCube5;
    private final ModelRenderer smallHeartCube6;
    private final ModelRenderer heartLargeAbdomen;
    private final ModelRenderer largeHeartCube1;
    private final ModelRenderer largeHeartCube2;
    private final ModelRenderer largeHeartCube3;
    private final ModelRenderer heartSmallAbdomen;
    private final ModelRenderer smallHeartCube1;
    private final ModelRenderer smallHeartCube2;
    private final ModelRenderer smallHeartCube3;
    private final ModelRenderer heartLeftArm;
    private final ModelRenderer heartCube4;
    private final ModelRenderer heartCube5;
    private final ModelRenderer heartCube6;
    private final ModelRenderer heartRightArm;
    private final ModelRenderer heartCube1;
    private final ModelRenderer heartCube2;
    private final ModelRenderer heartCube3;
    private final ModelRenderer heartRightLeg;
    private final ModelRenderer heartCube10;
    private final ModelRenderer heartCube11;
    private final ModelRenderer heartCube12;
    private final ModelRenderer heartLeftLeg;
    private final ModelRenderer heartCube7;
    private final ModelRenderer heartCube8;
    private final ModelRenderer heartCube9;
    private final ModelRenderer beltRight;
    private final ModelRenderer beltLeft;
    private final ModelRenderer strapLeft;
    private final ModelRenderer strapRight;

    public OTWModel() {
        super();

        addHumanoidBaseBoxes(null);
        texWidth = 128;
        texHeight = 128;

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, 0.0F);
        head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        headpiece = new ModelRenderer(this);
        headpiece.setPos(0.0F, -2.0F, -5.3F);
        head.addChild(headpiece);


        slopeNew = new ModelRenderer(this);
        slopeNew.setPos(0.0F, -6.4F, 1.3F);
        headpiece.addChild(slopeNew);

        new MeshModelBox.Builder(true, this)
            .startFace(Direction.EAST)
                .withVertex(    4.2,       3,     8.4,      30,  22)
                .withVertex(    4.2,    -4.4,     8.4,      30,  28)
                .withVertex(    4.2,       0,       0,      38,  22)
                .withVertex(    4.2,    -6.4,       0,      38,  28)
            .createFace()
            .startFace(Direction.WEST)
                .withVertex(   -4.2,       3,     8.4,      54,  22)
                .withVertex(   -4.2,       0,       0,      46,  22)
                .withVertex(   -4.2,    -4.4,     8.4,      54,  28)
                .withVertex(   -4.2,    -6.4,       0,      46,  28)
            .createFace()
            .startFaceCalcNormal()
                .withVertex(    4.2,       3,     8.4,      38,  14)
                .withVertex(    4.2,       0,       0,      38,  22)
                .withVertex(   -4.2,       3,     8.4,      46,  14)
                .withVertex(   -4.2,       0,       0,      46,  22)
            .createFace()
            .startFaceCalcNormal()
                .withVertex(    4.2,    -4.4,     8.4,      46,  22)
                .withVertex(   -4.2,    -4.4,     8.4,      54,  22)
                .withVertex(    4.2,    -6.4,       0,      46,  14)
                .withVertex(   -4.2,    -6.4,       0,      54,  14)
            .createFace()
            .startFace(Direction.SOUTH)
                .withVertex(    4.2,       3,     8.4,      62,  22)
                .withVertex(   -4.2,       3,     8.4,      54,  22)
                .withVertex(    4.2,    -4.4,     8.4,      62,  28)
                .withVertex(   -4.2,    -4.4,     8.4,      54,  28)
            .createFace()
        .buildCube().addCube(slopeNew);
        
        
        faceRightNew = new ModelRenderer(this);
        faceRightNew.setPos(-4.2F, -6.4F, 1.3F);
        headpiece.addChild(faceRightNew);
        
        new MeshModelBox.Builder(true, this)
            .startFaceCalcNormal()
                .withVertex(      0,     0,       0,   70,  21)
                .withVertex(-4.2005,  -0.5,   -1.31,   74,  21)
                .withVertex(-4.2005,     0,  0.0266,   74,  22)
            .createFace()
            .startFaceCalcNormal()
                .withVertex(      0,   -6.4,        0,  74,  22)
                .withVertex(-4.2005,   -6.4,   0.0266,  78,  21)
                .withVertex(-4.2005,  -6.75,    -1.31,  78,  22)
            .createFace()
//            .startFaceCalcNormal()
            .startFace(new Vector3f(-0.5f, 0, -0.86602540378f))
                .withVertex(      0,      0,      0,      70,  22)
                .withVertex(      0,   -6.4,      0,      70,  28)
                .withVertex(-4.2005,   -0.5,  -1.31,      74,  22)
                .withVertex(-4.2005,  -6.75,  -1.31,      74,  28)
            .createFace()
            .startFaceCalcNormal()
                .withVertex(-4.6173,       0,  0.0266,      75,  22)
                .withVertex(-4.2005,    -0.5,   -1.31,      74,  22)
                .withVertex(-4.2005,   -6.75,   -1.31,      74,  28)
                .withVertex(-4.6173,    -6.4,  0.0266,      75,  28)
            .createFace()
        .buildCube().addCube(faceRightNew);
        

        faceLeftNew = new ModelRenderer(this);
        faceLeftNew.setPos(4.2F, -6.4F, 1.3F);
        headpiece.addChild(faceLeftNew);
        
        new MeshModelBox.Builder(true, this)
            .startFaceCalcNormal()
                .withVertex( 4.2005,       0,  0.0266,     85,  22)
                .withVertex( 4.2005,    -0.5,   -1.31,     85,  21)
                .withVertex(      0,       0,       0,     81,  21)
            .createFace()
            .startFaceCalcNormal()
                .withVertex( 4.2005,   -6.75,   -1.31,     89,  22)
                .withVertex( 4.2005,    -6.4,  0.0266,     89,  21)
                .withVertex(      0,    -6.4,       0,     85,  22)
            .createFace()
//            .startFaceCalcNormal()
            .startFace(new Vector3f(0.5f, 0, -0.86602540378f))
                .withVertex( 4.2005,    -0.5,   -1.31,     85,  22)
                .withVertex( 4.2005,   -6.75,   -1.31,     85,  28)
                .withVertex(      0,       0,       0,     81,  22)
                .withVertex(      0,    -6.4,       0,     81,  28)
            .createFace()
            .startFaceCalcNormal()
                .withVertex( 4.6173,       0,  0.0266,     85,  22)
                .withVertex( 4.6173,    -6.4,  0.0266,     85,  28)
                .withVertex( 4.2005,   -6.75,   -1.31,     86,  28)
                .withVertex( 4.2005,    -0.5,   -1.31,     86,  22)
            .createFace()
        .buildCube().addCube(faceLeftNew);
        

        leftCable = new ModelRenderer(this);
        leftCable.setPos(1.25F, -3.3F, 0.25F);
        head.addChild(leftCable);
        setRotationAngle(leftCable, 0.0873F, 0.1309F, -1.2217F);
        leftCable.texOffs(13, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 5.0F, 0.0F, true);
        leftCable.texOffs(13, 25).addBox(-0.5F, 1.0F, 1.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);

        rightCable = new ModelRenderer(this);
        rightCable.setPos(-1.25F, -3.3F, 0.25F);
        head.addChild(rightCable);
        setRotationAngle(rightCable, 0.0873F, -0.1309F, 1.2217F);
        rightCable.texOffs(0, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 4.0F, 5.0F, 0.0F, false);
        rightCable.texOffs(0, 25).addBox(-0.5F, 1.0F, 1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        heartSmallHead = new ModelRenderer(this);
        heartSmallHead.setPos(0.0F, 0.55F, -4.0F);
        head.addChild(heartSmallHead);


        smallHeartCube4 = new ModelRenderer(this);
        smallHeartCube4.setPos(0.0F, 0.0F, 0.0F);
        heartSmallHead.addChild(smallHeartCube4);
        setRotationAngle(smallHeartCube4, 0.0F, 0.0F, -0.7854F);
        smallHeartCube4.texOffs(4, 4).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        smallHeartCube5 = new ModelRenderer(this);
        smallHeartCube5.setPos(0.3F, -0.3F, 0.0F);
        heartSmallHead.addChild(smallHeartCube5);
        setRotationAngle(smallHeartCube5, 0.0F, 0.0F, -0.7854F);
        smallHeartCube5.texOffs(4, 6).addBox(0.175F, -1.0F, -0.5F, 0.925F, 1.0F, 1.0F, -0.2F, false);

        smallHeartCube6 = new ModelRenderer(this);
        smallHeartCube6.setPos(-0.3F, -0.3F, 0.0F);
        heartSmallHead.addChild(smallHeartCube6);
        setRotationAngle(smallHeartCube6, 0.0F, 0.0F, -0.7854F);
        smallHeartCube6.texOffs(0, 6).addBox(0.0F, -1.1F, -0.5F, 1.0F, 0.925F, 1.0F, -0.2F, false);

        body = new ModelRenderer(this);
        body.setPos(0.0F, 0.0F, 0.0F);


        upperPart = new ModelRenderer(this);
        upperPart.setPos(0.0F, 12.0F, 0.0F);
        body.addChild(upperPart);


        torso = new ModelRenderer(this);
        torso.setPos(0.0F, -12.0F, 0.0F);
        upperPart.addChild(torso);
        torso.texOffs(0, 64).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        torso.texOffs(0, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.1F, false);
        torso.texOffs(20, 64).addBox(-3.5F, 1.1F, -2.0F, 7.0F, 3.0F, 1.0F, 0.4F, false);
        torso.texOffs(24, 73).addBox(-2.5F, 4.0F, -2.3F, 5.0F, 6.0F, 1.0F, 0.0F, false);
        torso.texOffs(9, 80).addBox(0.6F, 1.0F, 2.0F, 2.0F, 5.0F, 2.0F, 0.1F, true);
        torso.texOffs(0, 80).addBox(-2.6F, 1.0F, 2.0F, 2.0F, 5.0F, 2.0F, 0.1F, false);

        beltRight = new ModelRenderer(this);
        beltRight.setPos(-2.0F, 10.35F, 0.0F);
        torso.addChild(beltRight);
        setRotationAngle(beltRight, 0.0F, 0.0F, 0.1309F);
        beltRight.texOffs(64, 74).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.13F, false);

        beltLeft = new ModelRenderer(this);
        beltLeft.setPos(2.0F, 10.35F, 0.0F);
        torso.addChild(beltLeft);
        setRotationAngle(beltLeft, 0.0F, 0.0F, -0.1309F);
        beltLeft.texOffs(80, 74).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.13F, false);

        strapLeft = new ModelRenderer(this);
        strapLeft.setPos(2.65F, 10.0F, 0.0F);
        torso.addChild(strapLeft);
        setRotationAngle(strapLeft, 0.0F, 0.0F, 0.0611F);
        strapLeft.texOffs(50, 65).addBox(-1.35F, -10.1F, -2.5F, 2.0F, 10.0F, 5.0F, 0.0F, true);

        strapRight = new ModelRenderer(this);
        strapRight.setPos(-2.3F, 10.0F, 0.0F);
        torso.addChild(strapRight);
        setRotationAngle(strapRight, 0.0F, 0.0F, -0.0611F);
        strapRight.texOffs(36, 65).addBox(-1.0F, -10.1F, -2.5F, 2.0F, 10.0F, 5.0F, 0.0F, false);

        heartLargeAbdomen = new ModelRenderer(this);
        heartLargeAbdomen.setPos(0.0F, 11.5F, -2.0F);
        torso.addChild(heartLargeAbdomen);


        largeHeartCube1 = new ModelRenderer(this);
        largeHeartCube1.setPos(0.0F, 2.0F, 0.25F);
        heartLargeAbdomen.addChild(largeHeartCube1);
        setRotationAngle(largeHeartCube1, 0.0F, 0.0F, 0.7854F);
        largeHeartCube1.texOffs(28, 81).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 0.5F, 0.0F, 0.25F, false);

        largeHeartCube2 = new ModelRenderer(this);
        largeHeartCube2.setPos(0.0F, 2.0F, 0.25F);
        heartLargeAbdomen.addChild(largeHeartCube2);
        setRotationAngle(largeHeartCube2, 0.0F, 0.0F, -0.7854F);
        largeHeartCube2.texOffs(25, 81).addBox(0.0F, -2.0F, -0.5F, 1.0F, 0.5F, 0.0F, 0.25F, false);

        largeHeartCube3 = new ModelRenderer(this);
        largeHeartCube3.setPos(0.0F, 2.0F, 0.25F);
        heartLargeAbdomen.addChild(largeHeartCube3);
        setRotationAngle(largeHeartCube3, 0.0F, 0.0F, -0.7854F);
        largeHeartCube3.texOffs(22, 81).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 0.0F, 0.25F, false);

        heartSmallAbdomen = new ModelRenderer(this);
        heartSmallAbdomen.setPos(0.0F, 11.3F, -2.05F);
        torso.addChild(heartSmallAbdomen);


        smallHeartCube1 = new ModelRenderer(this);
        smallHeartCube1.setPos(0.0F, 0.0F, 0.0F);
        heartSmallAbdomen.addChild(smallHeartCube1);
        setRotationAngle(smallHeartCube1, 0.0F, 0.0F, -0.7854F);
        smallHeartCube1.texOffs(17, 82).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        smallHeartCube2 = new ModelRenderer(this);
        smallHeartCube2.setPos(0.3F, -0.3F, 0.0F);
        heartSmallAbdomen.addChild(smallHeartCube2);
        setRotationAngle(smallHeartCube2, 0.0F, 0.0F, -0.7854F);
        smallHeartCube2.texOffs(17, 80).addBox(0.175F, -1.0F, -0.5F, 0.825F, 1.0F, 1.0F, -0.2F, false);

        smallHeartCube3 = new ModelRenderer(this);
        smallHeartCube3.setPos(-0.3F, -0.3F, 0.0F);
        heartSmallAbdomen.addChild(smallHeartCube3);
        setRotationAngle(smallHeartCube3, 0.0F, 0.0F, -0.7854F);
        smallHeartCube3.texOffs(17, 85).addBox(0.0F, -1.0F, -0.5F, 1.0F, 0.825F, 1.0F, -0.2F, false);

        leftArm = convertLimb(new ModelRenderer(this));
        leftArm.setPos(6.0F, -10.0F, 0.0F);
        upperPart.addChild(leftArm);
        leftArm.texOffs(32, 108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftArm.texOffs(53,  95).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.1F, true);
        leftArm.texOffs(48, 110).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.25F, true);
        leftArm.texOffs(48, 105).addBox(-2.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.075F, true);

        heartLeftArm = new ModelRenderer(this);
        heartLeftArm.setPos(0.0F, 3.8F, 1.8F);
        leftArm.addChild(heartLeftArm);


        heartCube4 = new ModelRenderer(this);
        heartCube4.setPos(0.0F, 0.0F, 0.0F);
        heartLeftArm.addChild(heartCube4);
        setRotationAngle(heartCube4, 0.0F, 0.0F, -0.7854F);
        heartCube4.texOffs(48, 119).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

        heartCube5 = new ModelRenderer(this);
        heartCube5.setPos(0.5F, -0.5F, 0.0F);
        heartLeftArm.addChild(heartCube5);
        setRotationAngle(heartCube5, 0.0F, 0.0F, -0.7854F);
        heartCube5.texOffs(44, 120).addBox(0.19F, -1.0F, -0.5F, 0.81F, 1.0F, 1.0F, -0.05F, false);

        heartCube6 = new ModelRenderer(this);
        heartCube6.setPos(-0.5F, -0.5F, 0.0F);
        heartLeftArm.addChild(heartCube6);
        setRotationAngle(heartCube6, 0.0F, 0.0F, -0.7854F);
        heartCube6.texOffs(48, 121).addBox(0.0F, -1.0F, -0.5F, 1.0F, 0.81F, 1.0F, -0.05F, false);

        leftArmJoint = new ModelRenderer(this);
        leftArmJoint.setPos(0.0F, 4.0F, 0.0F);
        leftArm.addChild(leftArmJoint);
        leftArmJoint.texOffs(32, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

        leftForeArm = new ModelRenderer(this);
        leftForeArm.setPos(0.0F, 4.0F, 0.0F);
        leftArm.addChild(leftForeArm);
        leftForeArm.texOffs(32, 118).addBox(-2.0F,  0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, true);
        leftForeArm.texOffs(48, 105).addBox(-2.0F,  3.1F, -2.0F, 4.0F, 1.0F, 4.0F,  0.075F, true);
        leftForeArm.texOffs(48, 119).addBox(-2.0F, -0.4F, -2.0F, 4.0F, 4.0F, 4.0F,   0.15F, true);
        leftForeArm.texOffs(32,  96).addBox( 0.9F,  2.7F, -1.5F, 2.0F, 3.0F, 3.0F,   -0.6F, true);
        leftForeArm.texOffs(42,  97).addBox( 1.5F,  5.1F, -2.0F, 1.0F, 1.0F, 4.0F,   -0.2F, true);

        rightArm = convertLimb(new ModelRenderer(this));
        rightArm.setPos(-6.0F, -10.0F, 0.0F);
        upperPart.addChild(rightArm);
        rightArm.texOffs(0,  108).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F,  4.0F,   0.0F, false);
        rightArm.texOffs(18,  87).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F,  4.0F,   0.1F, false);
        rightArm.texOffs(16, 110).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 3.0F,  4.0F,  0.25F, false);
        rightArm.texOffs(16, 105).addBox(-2.0F,  3.0F, -2.0F, 4.0F, 1.0F,  4.0F, 0.075F, false);

        heartRightArm = new ModelRenderer(this);
        heartRightArm.setPos(0.0F, 3.8F, 1.8F);
        rightArm.addChild(heartRightArm);


        heartCube1 = new ModelRenderer(this);
        heartCube1.setPos(0.0F, 0.0F, 0.0F);
        heartRightArm.addChild(heartCube1);
        setRotationAngle(heartCube1, 0.0F, 0.0F, -0.7854F);
        heartCube1.texOffs(16, 119).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

        heartCube2 = new ModelRenderer(this);
        heartCube2.setPos(0.5F, -0.5F, 0.0F);
        heartRightArm.addChild(heartCube2);
        setRotationAngle(heartCube2, 0.0F, 0.0F, -0.7854F);
        heartCube2.texOffs(12, 120).addBox(0.19F, -1.0F, -0.5F, 0.81F, 1.0F, 1.0F, -0.05F, false);

        heartCube3 = new ModelRenderer(this);
        heartCube3.setPos(-0.5F, -0.5F, 0.0F);
        heartRightArm.addChild(heartCube3);
        setRotationAngle(heartCube3, 0.0F, 0.0F, -0.7854F);
        heartCube3.texOffs(16, 121).addBox(0.0F, -1.0F, -0.5F, 1.0F, 0.81F, 1.0F, -0.05F, false);

        rightArmJoint = new ModelRenderer(this);
        rightArmJoint.setPos(0.0F, 4.0F, 0.0F);
        rightArm.addChild(rightArmJoint);
        rightArmJoint.texOffs(0, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

        rightForeArm = new ModelRenderer(this);
        rightForeArm.setPos(0.0F, 4.0F, 0.0F);
        rightArm.addChild(rightForeArm);
        rightForeArm.texOffs(0,  118).addBox(-2.0F,  0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        rightForeArm.texOffs(16, 105).addBox(-2.0F,  3.1F, -2.0F, 4.0F, 1.0F, 4.0F,  0.075F, false);
        rightForeArm.texOffs(16, 119).addBox(-2.0F, -0.4F, -2.0F, 4.0F, 4.0F, 4.0F,   0.15F, false);
        rightForeArm.texOffs(0,   96).addBox(-2.9F,  2.7F, -1.5F, 2.0F, 3.0F, 3.0F,   -0.6F, false);
        rightForeArm.texOffs(10,  97).addBox(-2.5F,  5.1F, -2.0F, 1.0F, 1.0F, 4.0F,   -0.2F, false);

        leftLeg = convertLimb(new ModelRenderer(this));
        leftLeg.setPos(1.9F, 12.0F, 0.0F);
        body.addChild(leftLeg);
        leftLeg.texOffs(96,  108).addBox(-2.0F,   0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        leftLeg.texOffs(112,  99).addBox(-2.0F,   0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.2F, false);
        leftLeg.texOffs(112, 108).addBox( 1.8F, -1.75F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);

        heartRightLeg = new ModelRenderer(this);
        heartRightLeg.setPos(0.0F, 6.0F, -1.8F);
        leftLeg.addChild(heartRightLeg);


        heartCube10 = new ModelRenderer(this);
        heartCube10.setPos(0.0F, 0.05F, 0.0F);
        heartRightLeg.addChild(heartCube10);
        setRotationAngle(heartCube10, 0.0F, 0.0F, -0.7854F);
        heartCube10.texOffs(96, 120).addBox(0.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

        heartCube11 = new ModelRenderer(this);
        heartCube11.setPos(0.5F, -0.45F, 0.0F);
        heartRightLeg.addChild(heartCube11);
        setRotationAngle(heartCube11, 0.0F, 0.0F, -0.7854F);
        heartCube11.texOffs(92, 120).addBox(0.19F, -1.05F, -0.5F, 0.81F, 1.0F, 1.0F, -0.05F, false);

        heartCube12 = new ModelRenderer(this);
        heartCube12.setPos(-0.5F, -0.45F, 0.0F);
        heartRightLeg.addChild(heartCube12);
        setRotationAngle(heartCube12, 0.0F, 0.0F, -0.7854F);
        heartCube12.texOffs(92, 118).addBox(0.0F, -1.05F, -0.5F, 1.0F, 0.81F, 1.0F, -0.05F, false);

        leftLegJoint = new ModelRenderer(this);
        leftLegJoint.setPos(0.0F, 6.0F, 0.0F);
        leftLeg.addChild(leftLegJoint);
        leftLegJoint.texOffs(96, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, true);

        leftLowerLeg = new ModelRenderer(this);
        leftLowerLeg.setPos(0.0F, 6.0F, 0.0F);
        leftLeg.addChild(leftLowerLeg);
        leftLowerLeg.texOffs(96,  118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        leftLowerLeg.texOffs(112, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F,    0.2F, false);

        rightLeg = convertLimb(new ModelRenderer(this));
        rightLeg.setPos(-1.9F, 12.0F, 0.0F);
        body.addChild(rightLeg);
        rightLeg.texOffs(64, 108).addBox(-2.0F,   0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        rightLeg.texOffs(80,  99).addBox(-2.0F,   0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.2F, false);
        rightLeg.texOffs(80, 108).addBox(-2.8F, -1.25F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);

        heartLeftLeg = new ModelRenderer(this);
        heartLeftLeg.setPos(0.0F, 6.0F, -1.8F);
        rightLeg.addChild(heartLeftLeg);


        heartCube7 = new ModelRenderer(this);
        heartCube7.setPos(0.0F, 0.05F, 0.0F);
        heartLeftLeg.addChild(heartCube7);
        setRotationAngle(heartCube7, 0.0F, 0.0F, -0.7854F);
        heartCube7.texOffs(64, 120).addBox(0.0F, -1.05F, -0.5F, 1.0F, 1.0F, 1.0F, -0.05F, false);

        heartCube8 = new ModelRenderer(this);
        heartCube8.setPos(0.5F, -0.45F, 0.0F);
        heartLeftLeg.addChild(heartCube8);
        setRotationAngle(heartCube8, 0.0F, 0.0F, -0.7854F);
        heartCube8.texOffs(60, 120).addBox(0.19F, -1.05F, -0.5F, 0.81F, 1.0F, 1.0F, -0.05F, false);

        heartCube9 = new ModelRenderer(this);
        heartCube9.setPos(-0.5F, -0.45F, 0.0F);
        heartLeftLeg.addChild(heartCube9);
        setRotationAngle(heartCube9, 0.0F, 0.0F, -0.7854F);
        heartCube9.texOffs(60, 118).addBox(0.0F, -1.05F, -0.5F, 1.0F, 0.81F, 1.0F, -0.05F, false);

        rightLegJoint = new ModelRenderer(this);
        rightLegJoint.setPos(0.0F, 6.0F, 0.0F);
        rightLeg.addChild(rightLegJoint);
        rightLegJoint.texOffs(64, 102).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, -0.1F, false);

        rightLowerLeg = new ModelRenderer(this);
        rightLowerLeg.setPos(0.0F, 6.0F, 0.0F);
        rightLeg.addChild(rightLowerLeg);
        rightLowerLeg.texOffs(64, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, -0.001F, false);
        rightLowerLeg.texOffs(80, 118).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F,    0.2F, false);
    }

    @Override
    protected RotationAngle[][] initSummonPoseRotations() {
        return new RotationAngle[][] {
        new RotationAngle[] {
                    new RotationAngle(head,                10F,      0.0F,       0.0F),
                    new RotationAngle(body,              -7.5F,      0.0F,       0.0F),
                    new RotationAngle(leftArm,      -95.32024F, 60.25015F, -77.70242F),
                    new RotationAngle(leftForeArm,  -29.51816F,  4.75113F,  11.57518F),
                    new RotationAngle(rightArm,     -76.44906F, -62.3513F,  68.35546F),
                    new RotationAngle(rightForeArm, -44.31282F, -8.80348F,  -8.90928F),
                    new RotationAngle(leftLeg,             15F,      0.0F,      -7.5F),
                    new RotationAngle(leftLowerLeg,       7.5F,      0.0F,       0.0F),
                    new RotationAngle(rightLeg,          12.5F,      0.0F,        10F),
                    new RotationAngle(rightLowerLeg, 12.38671F, -1.59356F,   0.39358F)
            },
            new RotationAngle[] {
                    new RotationAngle(head,                15F,       0.0F,      0.0F),
                    new RotationAngle(body,               0.0F,       0.0F,      0.0F),
                    new RotationAngle(leftArm,            0.0F,       0.0F,      -20F),
                    new RotationAngle(leftForeArm,  -14.46169F,  30.24394F,  7.03197F),
                    new RotationAngle(rightArm,           0.0F,       0.0F,       20F),
                    new RotationAngle(rightForeArm, -16.47027F, -24.09293F, -10.6183F),
                    new RotationAngle(leftLeg,            0.0F,       0.0F,       -5F),
                    new RotationAngle(leftLowerLeg,        15F,       0.0F,      0.0F),
                    new RotationAngle(rightLeg,           0.0F,       0.0F,        5F),
                    new RotationAngle(rightLowerLeg,     12.5F,       0.0F,      0.0F)
            },
            new RotationAngle[] {
                    new RotationAngle(leftArm,          0.0F, -0.5236F, -0.8727F),
                    new RotationAngle(leftForeArm,      0.0F,  1.1781F,  0.9599F),
                    new RotationAngle(rightArm,         0.0F,  0.5236F,   1.309F),
                    new RotationAngle(rightForeArm,     0.0F, -1.1781F, -0.9599F),
                    new RotationAngle(leftLeg,          0.0F,     0.0F, -0.1745F),
                    new RotationAngle(rightLeg,     -0.4363F,     0.0F,  0.1745F),
                    new RotationAngle(rightLowerLeg, 1.0472F,     0.0F,     0.0F)
            },
            new RotationAngle[] {
                    new RotationAngle(head,            -27.5F,       0.0F,       0.0F),
                    new RotationAngle(body,                5F,       -20F,       0.0F),
                    new RotationAngle(heartLargeAbdomen, -20F,       0.0F,       0.0F),
                    new RotationAngle(leftArm,     -43.97549F, -65.19239F,   0.91047F),
                    new RotationAngle(leftForeArm,       -25F,       0.0F,       0.0F),
                    new RotationAngle(rightArm,    -44.46244F,  59.75363F,  -7.27583F),
                    new RotationAngle(rightForeArm,      -35F,       0.0F,       0.0F),
                    new RotationAngle(leftLeg,      -5.67422F, -21.63647F, -11.85891F),
                    new RotationAngle(leftLowerLeg,     37.5F,       0.0F,       0.0F),
                    new RotationAngle(rightLeg,     -2.57561F,  14.76769F,   9.33832F),
                    new RotationAngle(rightLowerLeg,      40F,       0.0F,       0.0F)
            }
        };
    }

    @Override
    protected void initActionPoses() {
        ModelPose<OTWEntity> heavyPunchPose1 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(leftArm,      -25.05388F, -65.90872F, -98.34827F),
                new RotationAngle(leftForeArm,        0.0F,       0.0F, 47.5F),
                new RotationAngle(rightArm,      -6.19998F, -38.53555F, 29.64428F),
                new RotationAngle(rightForeArm, -29.97748F,   6.22086F, -8.2063F),
                new RotationAngle(leftLeg,             15F,       0.0F, -7.5F),
                new RotationAngle(leftLowerLeg,      27.5F,       0.0F, 0.0F),
                new RotationAngle(rightLeg,           0.0F,        10f, 5f),
                new RotationAngle(rightLowerLeg,     27.5F,       0.0F, 0.0F)
        });

        ModelPose<OTWEntity> heavyPunchPose2 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head,              0.0F,       0.0F,       0.0F),
                new RotationAngle(body,           0.2182F,   -0.5236F,       0.0F),
                new RotationAngle(upperPart,         0.0F,       0.0F,       0.0F),
                new RotationAngle(leftArm,     -34.24826F, -63.42352F, -88.17762F),
                new RotationAngle(leftForeArm,       -30F,       0.0F,        75F),
                new RotationAngle(rightArm,    -53.13117F,   6.27305F,  50.56617F),
                new RotationAngle(rightForeArm,-82.47748F,   6.22086F,   -8.2063F),
                new RotationAngle(leftLeg,      18.41527F,   -19.291F, -12.88152F),
                new RotationAngle(rightLeg,          0.0F,       -10F,         5F),
                new RotationAngle(rightLowerLeg,    22.5F,       0.0F,       0.0F)
        });
        ModelPose<OTWEntity> heavyPunchPose3 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(body, 0.0F, 0.0F, 0.0F),
                new RotationAngle(upperPart, 0.0F, 37.5F, 0.0F),
                new RotationAngle(leftArm, -62.22436F, -20.36472F, -55.76905F),
                new RotationAngle(leftForeArm, -20.65293F, 7.14496F, 15.48416F),
                new RotationAngle(rightArm, -30.73169F, 22.99966F, 58.35394F),
                new RotationAngle(rightForeArm, 0.0F, 0.0F, -2.5F)
        });
        actionAnim.put(StandPose.HEAVY_ATTACK, new PosedActionAnimation.Builder<OTWEntity>()
                .addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransition<>(heavyPunchPose1, heavyPunchPose2).setEasing(pr -> Math.max(pr * 3F - 2F, 0F)))
                .addPose(StandEntityAction.Phase.PERFORM, new ModelPoseTransition<>(heavyPunchPose2, heavyPunchPose3))
                .addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(heavyPunchPose3)
                        .addPose(0.5F, heavyPunchPose1)
                        .addPose(0.7F, heavyPunchPose2)
                        .addPose(0.8F, heavyPunchPose3)
                        .build(idlePose))
                .build(idlePose));

        ModelPose<OTWEntity> kickPose1 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head, -7.5F, 153.33F, 0F),
                new RotationAngle(body, 0F, 153.33F, 0F),
                new RotationAngle(leftArm, 0F, 0F, -30F),
                new RotationAngle(leftForeArm, 0F, 0F, 15F),
                new RotationAngle(rightArm, -32.5F, 22.5F, -22.5F),
                new RotationAngle(rightForeArm, 0F, 0F, -45F),
                new RotationAngle(leftLeg, 0F, 0F, 0F),
                new RotationAngle(rightLeg, -10F, 0F, 20F),
                new RotationAngle(rightLowerLeg, 50F, 0F, 0F)
        });
        ModelPose<OTWEntity> kickPose2 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head, -11.25F, 230F, 0F),
                new RotationAngle(body, 0F, 230F, 0F),
                new RotationAngle(leftArm, 0F, 0F, -45F),
                new RotationAngle(leftForeArm, 0F, 0F, 22.5F),
                new RotationAngle(rightArm, -25.28F, 17.5F, -17.5F),
                new RotationAngle(rightForeArm, 0F, 0F, -35F),
                new RotationAngle(rightLeg, -15F, 0F, 30F),
                new RotationAngle(rightLowerLeg, 75F, 0F, 0F)
        });
        ModelPose<OTWEntity> kickPose3 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head, -15F, 360F, 0F),
                new RotationAngle(body, -43.00306F, 308.28988F, 36.20399F),
                new RotationAngle(leftArm, 0F, 0F, -60F),
                new RotationAngle(leftForeArm, 0F, 0F, 30F),
                new RotationAngle(rightArm, -18.06F, 12.5F, -12.5F),
                new RotationAngle(rightForeArm, 0F, 0F, -25F),
                new RotationAngle(leftLeg, 15.55245F, 35.50838F, -13.04428F),
                new RotationAngle(rightLeg, -30F, 0, 105F),
                new RotationAngle(rightLowerLeg, 0F, 0F, 0F)
        });
        actionAnim.put(StandPose.HEAVY_ATTACK_FINISHER, new PosedActionAnimation.Builder<OTWEntity>()
                .addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransitionMultiple.Builder<>(idlePose)
                        .addPose(0.5F, kickPose1)
                        .addPose(0.75F, kickPose2)
                        .build(kickPose3))
                .build(idlePose));

        ModelPose<OTWEntity> timeStopPose1 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(body, 12.5F, 0.0F, 0.0F),
                new RotationAngle(leftArm, 48.4155F, -50.01155F, -69.17924F),
                new RotationAngle(leftForeArm, -27.01413F, 29.11999F, 21.62725F),
                new RotationAngle(rightArm, 12.5F, 50F, 80F),
                new RotationAngle(rightForeArm, -65F, -22.5F, -90F),
                new RotationAngle(leftLeg, 0F, 2.5F, -7.5F),
                new RotationAngle(leftLowerLeg, 32.5F, 0.0F, 0.0F),
                new RotationAngle(rightLeg, -27.5F, 15F, 7.5F),
                new RotationAngle(rightLowerLeg, 72.5F, 0.0F, 0F)
        });
        ModelPose<OTWEntity> timeStopPose2 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head, -12.5F, 0.0F, 0.0F),
                new RotationAngle(body, 26.78135F, 20.29348F, 9.92926F),
                new RotationAngle(leftArm, 46.6566F, -65.16127F, -103.5066F),
                new RotationAngle(leftForeArm, -48.19025F, 28.00516F, 94.57968F),
                new RotationAngle(rightArm, 44.36766F, 50.99246F, 101.9388F),
                new RotationAngle(rightForeArm, -45F, -15, -90F),
                new RotationAngle(leftLeg, 10F, 0F, 0F),
                new RotationAngle(leftLowerLeg, 32.5F, 0.0F, 0F),
                new RotationAngle(rightLeg, -27.5F, 15F, 7.5F),
                new RotationAngle(rightLowerLeg, 72.5F, 0F, 0F)
        });
        ModelPose<OTWEntity> timeStopPose3 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head, 15.69284F, 16.88547F, 4.6653F),
                new RotationAngle(body,15.46025F, -46.10107F, -12.98921F),
                new RotationAngle(leftArm, 45.2214F, -34.59909F, -58.45635F),
                new RotationAngle(leftForeArm, -28.10276F, -0.43851F, 74.07713F),
                new RotationAngle(rightArm, -68.32273F, 6.0881F, 49.92082F),
                new RotationAngle(rightForeArm, -54.27642F, 17.45461F, -58.39005F),
                new RotationAngle(leftLeg, -60F, 0F, 0F),
                new RotationAngle(leftLowerLeg, 105F, 0F, 0F),
                new RotationAngle(rightLeg, 15F, 15F, 7.5F),
                new RotationAngle(rightLowerLeg, 17.5F, 0F, 0F)
        });
        ModelPose<OTWEntity> timeStopPose4 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head, 15.69284F, 16.88547F, 4.6653F),
                new RotationAngle(body, 15.46025F, -46.10107F, -12.98921F),
                new RotationAngle(leftArm, 45.2214F, -34.59909F, -58.45635F),
                new RotationAngle(leftForeArm, -28.10276F, -0.43851F, 74.07713F),
                new RotationAngle(rightArm, -68.32273F, 6.0881F, 49.92082F),
                new RotationAngle(rightForeArm, -54.27642F, 17.45461F, -58.39005F),
                new RotationAngle(leftLeg, -60F, 0.0F, 0F),
                new RotationAngle(leftLowerLeg, 105F, 0F, 0F),
                new RotationAngle(rightLeg, 15F, 15F, 7.5F),
                new RotationAngle(rightLowerLeg, 17.5F, 0F, 0F)
        });
        actionAnim.put(OTWTimeStop.TIME_STOP, new PosedActionAnimation.Builder<OTWEntity>()
                .addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPoseTransitionMultiple.Builder<>(idlePose)
                        .addPose(0.5F, timeStopPose1)
                        .addPose(0.75F, timeStopPose2)
                        .addPose(0.75F, timeStopPose3)
                        .addPose(0.95F, timeStopPose4)
                        .build(timeStopPose4))
                .build(idlePose));

        ModelPose<OTWEntity> punchPose1 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head, 0.0F, 0.0F, 0F),
                new RotationAngle(body, 40F, 45F, 0F),
                new RotationAngle(upperPart, 0F, 0F, 0F),
                new RotationAngle(leftArm, -25F, -35F, -65F),
                new RotationAngle(leftForeArm, -50F, 0F, -17.5F),
                new RotationAngle(rightArm, 0F, 85F, 90F),
                new RotationAngle(rightForeArm, -33.0896F, -17.2568F, -105.9398F),
                new RotationAngle(leftLeg, -90F, 0F, -10F),
                new RotationAngle(leftLowerLeg, 80F, 0F, 0F),
                new RotationAngle(rightLeg, 0F, 0F, 10F),
                new RotationAngle(rightLowerLeg, 0F, 0F, 0F)
        });
        ModelPose<OTWEntity> punchPose2 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head, 0.0F, 22.5F, 0.0F),
                new RotationAngle(body, 40F, 60F, 0F),
                new RotationAngle(leftArm, -10F, -35F, -65F),
                new RotationAngle(leftForeArm, -40F, -5F, -17.5F),
                new RotationAngle(rightArm, 105F, 67.5F, 180F),
                new RotationAngle(rightForeArm, -50.4689F, -48.3643F, -73.6793F),
                new RotationAngle(rightLeg, 10F, 0F, 10F)
        });
        ModelPose<OTWEntity> punchPose3 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(head, 0.0F, 0.0F, 0F),
                new RotationAngle(body, 30F, -30F, 0F),
                new RotationAngle(leftArm, 5F, -25F, -45F),
                new RotationAngle(leftForeArm, -60F, 20F, 30F),
                new RotationAngle(rightArm, -49.308F, 34.8829F, 81.833F),
                new RotationAngle(rightForeArm, -37.8852F, -9.0337F, -12.7323F),
                new RotationAngle(leftLeg, -120F, 0F, -10F),
                new RotationAngle(leftLowerLeg, 120F, 0F, 0F),
                new RotationAngle(rightLeg, 0F, 0F, 10F),
                new RotationAngle(rightLowerLeg, 45F, 0F, 0F)
        });
//        actionAnim.put(TheWorldOvaTSHeavyAttack.TS_PUNCH_POSE, new PosedActionAnimation.Builder<TheWorldOvaEntity>()
//                .addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransition<>(punchPose1, punchPose2))
//                .addPose(StandEntityAction.Phase.PERFORM, new ModelPoseTransition<>(punchPose2, punchPose3))
//                .addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(punchPose3)
//                        .addPose(0.5F, punchPose3)
//                        .build(idlePose))
//                .build(idlePose));

        actionAnim.put(StandPose.RANGED_ATTACK, new PosedActionAnimation.Builder<OTWEntity>()
                .addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPose<>(new RotationAngle[] {
                        new RotationAngle(body, 0.0F, -0.48F, 0.0F),
                        new RotationAngle(leftArm, 0.0F, 0.0F, 0.0F),
                        new RotationAngle(leftForeArm, 0.0F, 0.0F, 0.0F),
                        new RotationAngle(rightArm, -1.0908F, 0.0F, 1.5708F),
                        new RotationAngle(rightForeArm, 0.0F, 0.0F, 0.0F)
                }))
                .build(idlePose));

        ModelPose<OTWEntity> ultraPunchPose1 = new ModelPose<>(new RotationAngle[] {
				new RotationAngle(body, 0.0F, 35F, 0.0F),
				new RotationAngle(upperPart, 0.0F, 35F, 0.0F),
				new RotationAngle(leftArm, 32.5F, 0.0F, 0.0F),
				new RotationAngle(leftForeArm, -52.5F, 0.0F, 0.0F),
				new RotationAngle(rightArm, 28.88636F, -15.58394F, 25.96295F),
				new RotationAngle(rightForeArm, -60F, 0.0F, 0),
				new RotationAngle(leftLeg, 10F, 0.0F, -7.5F),
				new RotationAngle(leftLowerLeg, 10F, 0.0F, 0.0F),
				new RotationAngle(rightLeg, 25F, 0.0F, 10F),
				new RotationAngle(rightLowerLeg, 15F, 0.0F, 0.0F)
        });
        ModelPose<OTWEntity> ultraPunchPose2 = new ModelPose<>(new RotationAngle[] {
                new RotationAngle(body, 0.0F, -20F, 0.0F),
                new RotationAngle(upperPart, 0.0F, -30, 0.0F),
                new RotationAngle(leftArm, 0.0F, 0.0F, -20F),
                new RotationAngle(leftForeArm, -31.70243F, -15.10504F, 24.93934F),
                new RotationAngle(rightArm, -16.42141F, 25.23304F, 26.12805F),
                new RotationAngle(rightForeArm, -42.5F, 0.0F, 0.0F),
                new RotationAngle(leftLowerLeg, 15F, 0.0F, 0.0F),
                new RotationAngle(rightLeg, 10F, 0.0F, 10F),
                new RotationAngle(rightLowerLeg, 32.5F, 0.0F, 0.0F)
        });
        actionAnim.put(OTWUltraPunch.ULTRA_PUNCH, new PosedActionAnimation.Builder<OTWEntity>()
                .addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPoseTransition<>(idlePose, ultraPunchPose1))
                .addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransitionMultiple.Builder<>(idlePose)
                        .addPose(0.95F, ultraPunchPose1)
                        .addPose(1F, ultraPunchPose2)
                        .build(ultraPunchPose2))
                .build(idlePose));

        super.initActionPoses();
    }

    @Override
    protected ModelPose<OTWEntity> initIdlePose() {
        return new ModelPose<>(new RotationAngle[] {
                new RotationAngle(upperPart, 0, 0, 0),
                new RotationAngle(body,             0,          0,          0),
                new RotationAngle(leftArm,          -44.11732F, -52.71561F, 20.41555F),
                new RotationAngle(leftForeArm,      -35F,       0,          0),
                new RotationAngle(rightArm,         -30F,       47.5F,      0),
                new RotationAngle(rightForeArm,     -35F,       0,          0),
                new RotationAngle(leftLeg,          13.80962F,  -7.38542F,  -10.08453F),
                new RotationAngle(leftLowerLeg,     27.5F,      0,          0),
                new RotationAngle(rightLeg,         1.31845F,   9.91358F,   7.61435F),
                new RotationAngle(rightLowerLeg,    20F,        0,          0),
                new RotationAngle(heartLargeAbdomen,-10.2443,   3.4058,     0)
        });
    }

    @Override
    protected ModelPose<OTWEntity> initIdlePose2Loop() {
        return new ModelPose<>(new RotationAngle[] {
                new RotationAngle(leftArm,          -45.11732F, -53.71561F, 19.41555F),
                new RotationAngle(leftForeArm,      -35F,       0,          0),
                new RotationAngle(rightArm,         -31F,       46.5F,      -1),
                new RotationAngle(rightForeArm,     -35F,       0,          0)
    });
    }

    @Override
    public void poseIdleLoop(OTWEntity entity, float ticks, float yRotOffsetRad, float xRotRad, HandSide swingingHand) {
        super.poseIdleLoop(entity, ticks, yRotOffsetRad, xRotRad, swingingHand);
    }

}